package com.hibernate.collection.list;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	
	@ElementCollection(targetClass=Address.class)
	@JoinTable(name="ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="inc-gen", strategy="increment")
	@CollectionId(columns={@Column(name="ADDRESS_ID")}, generator="inc-gen", type=@Type(type="long"))
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
