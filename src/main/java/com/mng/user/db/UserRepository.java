package com.mng.user.db;

import org.springframework.data.repository.CrudRepository;

import com.mng.user.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
