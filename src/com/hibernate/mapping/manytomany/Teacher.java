package com.hibernate.mapping.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="TEACHER_DETAIL")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TEACHER_ID")
	private int teacherId;
	@Column(name="TEACHER_NAME")
	private String teacherName;
	
	@ManyToMany
	private Collection<Vehicle> vehicles=new ArrayList<Vehicle>();
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
