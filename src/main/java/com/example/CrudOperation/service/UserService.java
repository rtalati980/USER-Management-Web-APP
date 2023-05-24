package com.example.CrudOperation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudOperation.To.User;
import com.example.CrudOperation.repository.UserRepo;


@Service
public class UserService 
{
	@Autowired
	  private UserRepo userRepo;
	
	public List<User> getAllUsers()  
	{    
	List<User>userRecords = new ArrayList<>();    
	userRepo.findAll().forEach(userRecords::add);    
	return userRecords;    
	}    
	
	public User saveData(User user) {
		return userRepo.save(user);
	}
	
	public User findById(int id) {
		return userRepo.getReferenceById(id);
		
	}
	
	public void updateById(int id) {
		userRepo.findById(id);
	}
	
	public void delete(int id) {
		userRepo.deleteById(id);
		
	}

}
