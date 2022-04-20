package com.user.info.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.info.model.User;

@Repository
public interface UserDataRepository extends CrudRepository<User, String>{

}
