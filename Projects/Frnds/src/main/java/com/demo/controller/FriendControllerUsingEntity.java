package com.demo.controller;

import com.demo.entity.FriendEntity;
import com.demo.service.FriendService;
import com.demo.service.FriendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friends")
@CrossOrigin(origins = "*")
public class FriendControllerUsingEntity {

    private final FriendService friendService;

    @Autowired
    public FriendControllerUsingEntity(FriendService friendService){
        this.friendService = friendService;
    }

    @GetMapping
    public List<FriendEntity> getAllFriends(){
        return friendService.getAllFriends();
    }

    @GetMapping("/{id}")
    public FriendEntity getFriendById(@PathVariable Long id){
        return friendService.getFriendById(id);
    }

    @PutMapping("/{id}")
    public FriendEntity updateFriend(@PathVariable Long id, @RequestBody FriendEntity friend){
        return friendService.updateFriend(id,friend);
    }

    @DeleteMapping("/{id}")
    public void deleteFriend(@PathVariable Long id){
        friendService.deleteFriend(id);
    }
}
