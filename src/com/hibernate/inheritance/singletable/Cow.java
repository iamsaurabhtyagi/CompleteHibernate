package com.hibernate.inheritance.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="COW_CATEGORY")
public class Cow extends Animal{

	@Column(name="COW_NACK")
	private String deepNack;

	public String getDeepNack() {
		return deepNack;
	}
	public void setDeepNack(String deepNack) {
		this.deepNack = deepNack;
	}
}
