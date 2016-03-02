package com.hibernate.mapping.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="TEACHER_VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VEHCILE_ID")
	private int vehicleId;
	@Column(name="VECHILCE_NUMBER")
	private String vechicleNo;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToMany(mappedBy="vehicles")
	private Collection<Teacher> teachers=new ArrayList<Teacher>();
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVechicleNo() {
		return vechicleNo;
	}
	public void setVechicleNo(String vechicleNo) {
		this.vechicleNo = vechicleNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Collection<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(Collection<Teacher> teachers) {
		this.teachers = teachers;
	}

}
