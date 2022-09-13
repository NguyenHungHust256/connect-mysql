package com.luyenlaptrinh.connectmysql.repository;

import com.luyenlaptrinh.connectmysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, String> {
    List<User> findByName(String name);

    List<User> findByNameAndGender(String name, String gender);

    Optional<User> findById(String id);

    @Query(value = "SELECT * FROM USER WHERE NAME = ?1", nativeQuery = true)
    List<User> getUserByName(String name);

    @Query(value = "SELECT * FROM USER WHERE NAME = ?1 AND GENDER = ?2", nativeQuery = true)
    List<User> getUserByNameAndGender(String name, String gender);
}
