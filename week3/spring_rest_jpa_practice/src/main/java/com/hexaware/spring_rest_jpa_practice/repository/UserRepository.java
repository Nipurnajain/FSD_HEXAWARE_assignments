package com.hexaware.spring_rest_jpa_practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.spring_rest_jpa_practice.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	 @Query("SELECT u FROM Users u WHERE u.userName LIKE :prefix%")
	    List<Users> findByNameStartingWith(@Param("prefix") String prefix);
}
