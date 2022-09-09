package com.luyenlaptrinh.connectmysql.controller;


import com.luyenlaptrinh.connectmysql.entities.User;
import com.luyenlaptrinh.connectmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-user")
    public ResponseEntity<?> getUser(@RequestParam String id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok().body(user);
    }
}
