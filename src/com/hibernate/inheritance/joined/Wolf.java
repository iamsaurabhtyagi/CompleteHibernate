package com.hibernate.inheritance.joined;

import javax.persistence.Entity;

@Entity(name="WOLF_JOINED")
public class Wolf extends Animal{

	private String nonVegeterian;

	public String getNonVegeterian() {
		return nonVegeterian;
	}
	public void setNonVegeterian(String nonVegeterian) {
		this.nonVegeterian = nonVegeterian;
	}

}
