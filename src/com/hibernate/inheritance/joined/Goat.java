package com.hibernate.inheritance.joined;

import javax.persistence.Entity;


@Entity(name="GOAT_JOINED")
public class Goat extends Animal{

	private String vegeterian;

	public String getVegeterian() {
		return vegeterian;
	}
	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}

}
