package com.luyenlaptrinh.connectmysql.service;

import com.luyenlaptrinh.connectmysql.entities.User;

import java.util.List;

public interface UserService {
    User getUserById(String id);
    List<User> getAllUsers();
}
