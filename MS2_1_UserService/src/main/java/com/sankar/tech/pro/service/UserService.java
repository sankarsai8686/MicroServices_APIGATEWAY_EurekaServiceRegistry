package com.sankar.tech.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sankar.tech.pro.dto.Department;
import com.sankar.tech.pro.dto.UserWithDeptResponse;
import com.sankar.tech.pro.entity.User;
import com.sankar.tech.pro.exception.RecordsNotFoundException;
import com.sankar.tech.pro.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//commented due to usage of Eureka Service Registry
	//private static final String DEPT_ENDPOINT_URL = "http://localhost:9051/dept/";
	private static final String DEPT_ENDPOINT_URL = "http://DEPARTMENT-SERVICE/dept/";
	
	public User saveUser(User user)
	{
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}



	public List<User> getAllUsers() {
		log.info("Inside getAllUsers of UserService");
		return userRepository.findAll();
	}



	public UserWithDeptResponse getUserWithDepartment(Long userId) {
		
		log.info("Inside getUserWithDepartment of UserService");
		
		User user = userRepository.findByUserId(userId);
		
		if(user == null)
		{
			log.info("UserId : "+userId+" Not Found");
			throw new RecordsNotFoundException("UserId : "+userId+" Not Found");
		}
		
		Department department = restTemplate.getForObject(DEPT_ENDPOINT_URL+user.getDepartmentId(), Department.class);
		
		if(department == null)
		{
			log.info("Department Id : "+user.getDepartmentId()+" Not Found");
			throw new RecordsNotFoundException("Department Id : "+user.getDepartmentId()+" Not Found");
		}
		
		return new UserWithDeptResponse(user, department);
	}
	

}
