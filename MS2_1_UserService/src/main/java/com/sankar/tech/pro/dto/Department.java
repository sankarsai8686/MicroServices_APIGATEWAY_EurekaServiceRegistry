package com.sankar.tech.pro.dto;


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
public class Department {
	
	private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
