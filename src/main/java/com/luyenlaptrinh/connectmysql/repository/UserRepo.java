package com.luyenlaptrinh.connectmysql.repository;

import com.luyenlaptrinh.connectmysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
