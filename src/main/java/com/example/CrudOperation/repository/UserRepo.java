package com.example.CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudOperation.To.User;

public interface UserRepo extends  JpaRepository<User,Integer>{

}
