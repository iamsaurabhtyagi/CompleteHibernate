package com.hibernate.inheritance.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="BUFFALO_CATEGORY")
public class Buffalo extends Animal{

	@Column(name="BUFFALO_NACK")
	private String roundNack;

	public String getRoundNack() {
		return roundNack;
	}
	public void setRoundNack(String roundNack) {
		this.roundNack = roundNack;
	}
}
