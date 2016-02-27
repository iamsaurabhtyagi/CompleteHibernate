package com.hibernate.proxy.lazy;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import com.hibernate.collection.list.Address;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	
	@ElementCollection(targetClass=Address.class)
	@JoinTable(name="ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	private Collection<Address> sAddresses=new ArrayList<Address>();

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

	public Collection<Address> getsAddresses() {
		return sAddresses;
	}

	public void setsAddresses(Collection<Address> sAddresses) {
		this.sAddresses = sAddresses;
	}
	
}
