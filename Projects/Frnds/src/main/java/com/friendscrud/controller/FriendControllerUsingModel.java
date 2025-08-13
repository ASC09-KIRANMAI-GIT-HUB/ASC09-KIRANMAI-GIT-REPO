package com.demo.controller;

import com.demo.model.FriendModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class FriendControllerUsingModel {

    @GetMapping("/getHTMLContent")
    public String getHTMLContent() {
        String htmlOutput = "<html><head><title>Welcome</title><head>" + "<body><h1 style=\"color:red\">Rest API can also expose HTML Data - Friends Example</h1></body></html>";
        return htmlOutput;
    }

    @GetMapping("/getFriendsAsList")
    public List<FriendModel> getFriendsAsList() {
        List<FriendModel> friends = new java.util.ArrayList<>();
        friends.add(new FriendModel(1, "Alice", "alice@email.com", "1234567890"));
        friends.add(new FriendModel(2, "Bob", "bob@email.com", "1234567891"));
        friends.add(new FriendModel(3, "Charlie", "charlie@email.com", "1234567892"));
        return friends;
    }

    @GetMapping("/getFriendsAsMap")
    public Map<Integer, FriendModel> getFriendsMap(){
        Map<Integer, FriendModel> friendMap = new HashMap<>();
        friendMap.put(1,new FriendModel(1, "Alice", "alice@email.com", "1234567890"));
        friendMap.put(2,new FriendModel(2, "Bob", "bob@email.com", "1234567891"));
        friendMap.put(3,new FriendModel(3, "Charlie", "charlie@email.com", "1234567892"));
        return friendMap;
    }
}
