package com.nishant.springboot.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nishant.springboot.hibernate.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query("select u from User u")
	public List<User> getAll();
	
	@Query("select u from User u  where userid = ?1")
	public User getUserByID(Integer id);
}
