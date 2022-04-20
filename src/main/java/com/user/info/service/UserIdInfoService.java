package com.user.info.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.info.model.User;
import com.user.info.repository.UserDataRepositoryImpl;
import com.user.info.repository.UserDataService;

@RestController
public class UserIdInfoService {
	
	@Autowired
	public static UserDataService userDataService;
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public Optional<User> getUserId(@PathVariable String userId) {
		
		return userDataService.fetchUsersById(userId);
		
	}
	
	@RequestMapping(value="/saveuser}", method=RequestMethod.POST)
	public void saveUserData(@PathVariable User user) {
		userDataService.saveUser(user);
	}

}
