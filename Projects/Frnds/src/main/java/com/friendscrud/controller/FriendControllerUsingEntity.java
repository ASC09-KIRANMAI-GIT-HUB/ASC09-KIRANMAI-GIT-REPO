package com.demo.controller;

import com.demo.entity.FriendEntity;
import com.demo.service.FriendService;
import com.demo.service.FriendServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class FriendControllerUsingEntity {

    private final FriendService friendService;

    @Autowired
    public FriendControllerUsingEntity(FriendService friendService){
        this.friendService = friendService;
    }

    @GetMapping("/friends")
    public List<FriendEntity> getAllFriends(){
        return friendService.getAllFriends();
    }

    @GetMapping("/friends/{id}")
    public FriendEntity getFriendById(@PathVariable Long id){
        return friendService.getFriendById(id);
    }

    @PostMapping("/friends")
    public FriendEntity addFriend(@RequestBody FriendEntity friend){return friendService.addFriend(friend);}

    @PutMapping("/{id}")
    public FriendEntity updateFriend(@PathVariable Long id, @RequestBody FriendEntity friend){
        return friendService.updateFriend(id,friend);
    }

    @DeleteMapping("/friends/{id}")
    public void deleteFriend(@PathVariable Long id){
        friendService.deleteFriend(id);
    }
}
