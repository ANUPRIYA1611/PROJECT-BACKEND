package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class boutique {
@Id
	private int id;
	private String gender;
	private String materialType;
	private int price;
	private String materialname;


	public boutique(int id, String gender, String materialType, int price, String materialname) {
		super();
		this.id = id;
		this.gender = gender;
		this.materialType = materialType;
		this.price = price;
		this.materialname = materialname;
	}
	public boutique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}


	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
