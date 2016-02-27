package com.hibernate.collection.set;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class EmployeeDetail {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	
	@ElementCollection(targetClass=EmployeeAddress.class)
	@JoinTable(name="EMPLOYEE_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	private Set<EmployeeAddress> sAddresses=new HashSet<EmployeeAddress>();

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

	public Set<EmployeeAddress> getsAddresses() {
		return sAddresses;
	}

	public void setsAddresses(Set<EmployeeAddress> sAddresses) {
		this.sAddresses = sAddresses;
	}
	
}
