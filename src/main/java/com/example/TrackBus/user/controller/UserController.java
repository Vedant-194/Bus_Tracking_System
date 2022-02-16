package com.example.TrackBus.user.controller;

import com.example.TrackBus.user.dto.UserVO;
import com.example.TrackBus.user.entity.User;
import com.example.TrackBus.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserVO> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.getUserById( id );
    }

    @PostMapping("/authenticate")
    public boolean authenticate( @RequestBody User user){
        return userService.authenticate( user );
    }

    @PutMapping
    public UserVO saveUser( @RequestBody User user) throws Exception {
        return userService.saveUser( user );
    }
}
