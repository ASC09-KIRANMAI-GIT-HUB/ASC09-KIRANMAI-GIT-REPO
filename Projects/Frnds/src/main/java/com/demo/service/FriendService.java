package com.demo.service;

import com.demo.entity.FriendEntity;
import java.util.List;

public interface FriendService {
    List<FriendEntity> getAllFriends();
    FriendEntity getFriendById(Long Id);
    FriendEntity addFriend(FriendEntity friend);
    FriendEntity updateFriend(Long id,FriendEntity friend);
    void deleteFriend(Long id);

}
