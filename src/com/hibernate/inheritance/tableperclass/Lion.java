package com.hibernate.inheritance.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="LION_CATEGORY")
public class Lion extends Animal{

	@Column(name="NON_VEGETERIAN")
	private String nonVegetrian;

	public String getNonVegetrian() {
		return nonVegetrian;
	}
	public void setNonVegetrian(String nonVegetrian) {
		this.nonVegetrian = nonVegetrian;
	}
}
