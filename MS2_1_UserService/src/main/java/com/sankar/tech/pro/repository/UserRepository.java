package com.sankar.tech.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sankar.tech.pro.entity.User;
import java.lang.Long;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
		User findByUserId(Long userid);

}
