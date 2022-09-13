package com.luyenlaptrinh.connectmysql.service.imp;

import com.luyenlaptrinh.connectmysql.entities.User;
import com.luyenlaptrinh.connectmysql.repository.UserRepo;
import com.luyenlaptrinh.connectmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public User getUserById(String id) {
        Optional<User> userOptional = userRepo.findById(id);
        if(!userOptional.isPresent()){
            return null;
        }
        return userOptional.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
