package com.user.info.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.info.model.User;

@Service
public class UserDataRepositoryImpl implements UserDataService{
	
	@Autowired
	public UserDataRepository userDataRepository;
	

	@Override
	public User saveUser(User user) {
		return userDataRepository.save(user);
	}

	@Override
	public List<User> fetchUsersList() {
		return null;
	}

	@Override
	public Optional<User> fetchUsersById(String userId) {
		return userDataRepository.findById(userId);
	}

	@Override
	public User updateUser(User department, Long departmentId) {
		return null;
	}

	@Override
	public void deleteUserById(Long departmentId) {
		
	}
}
