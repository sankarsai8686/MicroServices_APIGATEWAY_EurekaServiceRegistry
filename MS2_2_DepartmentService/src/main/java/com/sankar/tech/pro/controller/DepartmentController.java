package com.sankar.tech.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankar.tech.pro.entity.Department;
import com.sankar.tech.pro.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/")
	public List<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/{deptId}")
	public Department findByDepartmentId(@PathVariable(name = "deptId") Long deptId)
	{
		return departmentService.findByDepartmentId(deptId);
	}
}
