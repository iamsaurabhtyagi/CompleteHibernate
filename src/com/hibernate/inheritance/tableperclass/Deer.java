package com.hibernate.inheritance.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="DEER_CATEGORY")
public class Deer extends Animal{

	@Column(name="VEGETERIAN")
	private String vegeterian;

	public String getVegeterian() {
		return vegeterian;
	}
	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}
}
