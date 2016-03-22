package com.hibernate.inheritance.demo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle{

	@Column(name="STEERING_HANDLE")
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}
	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

}
