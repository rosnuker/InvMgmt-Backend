package com.cap1grp16.invmgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap1grp16.invmgmt.Entity.UserEntity;
import com.cap1grp16.invmgmt.Service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    UserService userv;

    @PostMapping("/registerUser")
    public UserEntity registerUser(@RequestBody UserEntity user) {
        return userv.registerUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userv.getAllUsers();
    }
}
