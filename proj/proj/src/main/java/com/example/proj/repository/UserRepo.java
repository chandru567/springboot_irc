package com.example.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proj.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}