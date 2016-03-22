package com.hibernate.inheritance.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ANIMALS")
@DiscriminatorColumn(name="ANIMAL_CATEGORY")
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
