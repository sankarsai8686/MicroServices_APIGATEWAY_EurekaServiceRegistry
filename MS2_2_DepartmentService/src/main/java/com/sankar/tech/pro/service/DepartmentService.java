package com.sankar.tech.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sankar.tech.pro.entity.Department;
import com.sankar.tech.pro.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public Department saveDepartment(Department department)
	{
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}
	
	
	public List<Department> getAllDepartments()
	{
		log.info("Inside getAllDepartments of DepartmentService");
		return departmentRepository.findAll();
	}


	public Department findByDepartmentId(Long deptId) {
		log.info("Inside findByDepartmentId of DepartmentService");
		return departmentRepository.findByDepartmentId(deptId);
	}

}
