package com.sankar.tech.pro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_tb")
public class User {
	
	@Id
	@GeneratedValue
	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long departmentId;

}
