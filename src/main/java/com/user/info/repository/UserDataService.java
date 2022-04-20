package com.user.info.repository;

import java.util.List;
import java.util.Optional;

import com.user.info.model.User;

public interface UserDataService {

	// save operation
    User saveUser(User department);
  
    // read operation
    List<User> fetchUsersList();
    
    // read operation
    Optional<User> fetchUsersById(String userId);
  
    // update operation
    User updateUser(User department, Long departmentId);
  
    // delete operation
    void deleteUserById(Long departmentId);
    
}
