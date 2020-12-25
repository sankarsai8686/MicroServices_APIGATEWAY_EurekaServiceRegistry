package com.sankar.tech.pro.dto;

import com.sankar.tech.pro.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserWithDeptResponse {
	
	private User user;
	private Department department;

}
