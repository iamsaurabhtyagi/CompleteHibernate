package com.hibernate.inheritance.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="ANIMAL_CATEGORY")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ANIMAL_ID")
	private int id;
	@Column(name="LAGS")
	private String lags;
	@Column(name="TAILS")
	private String tail;
	@Column(name="COLOR")
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLags() {
		return lags;
	}
	public void setLags(String lags) {
		this.lags = lags;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
