package com.hibernate.inheritance.demo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle{

	@Column(name="STEERING_WHEEL")
	private String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}
	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
