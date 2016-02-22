package com.hibernate.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Employee_Details" )
public class Employee {

	@Id
	private int empId;
	private String name;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
