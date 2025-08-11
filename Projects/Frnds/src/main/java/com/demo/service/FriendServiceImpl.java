package com.demo.service;

import com.demo.entity.FriendEntity;
import com.demo.repsitory.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    private final FriendRepository friendRepository;

    @Autowired
    public FriendServiceImpl(FriendRepository friendRepository){
        this.friendRepository = friendRepository;
    }

    @Override
    public List<FriendEntity> getAllFriends(){
        return friendRepository.findAll();
    }

    @Override
    public FriendEntity getFriendById(Long id){
        return friendRepository.findById(id).orElse(null);
    }

    @Override
    public FriendEntity addFriend(FriendEntity friend){
        return friendRepository.save(friend);
    }

    @Override
    public FriendEntity updateFriend(Long id, FriendEntity friend){
        FriendEntity existing = friendRepository.findById(id).orElse(null);
        if(existing != null) {
            existing.setName(friend.getName());
            existing.setPhone(friend.getPhone());
            existing.setEmail(friend.getEmail());
            return friendRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteFriend(Long id){
        friendRepository.deleteById(id);
    }
}
