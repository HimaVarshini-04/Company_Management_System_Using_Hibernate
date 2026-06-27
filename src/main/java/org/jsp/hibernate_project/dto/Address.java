package org.jsp.hibernate_project.dto;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String place;
	private int pincode;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="address")
//	@OneToOne(cascade=CascadeType.ALL)
	private Company company;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
//		return "Address [aid=" + aid + ", place=" + place + ", pincode=" + pincode + ", company=" + company + "]";
		return "Address [aid=" + aid + ", place=" + place + ", pincode=" + pincode +  "]";
	}
	
	
}


















//
//package org.jsp.hibernate_project.dto;
//
//import javax.persistence.CascadeType;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Address {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int aid;
//	private String place;
//	private int pincode;
//	
//	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE},mappedBy="address")
////	@OneToOne(cascade=CascadeType.ALL,mappedBy="address")
//	private Company company;
//
//	public int getAid() {
//		return aid;
//	}
//
//	public void setAid(int aid) {
//		this.aid = aid;
//	}
//
//	public String getPlace() {
//		return place;
//	}
//
//	public void setPlace(String place) {
//		this.place = place;
//	}
//
//	public int getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//
//	public Company getCompany() {
//		return company;
//	}
//
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//
//	@Override
//	public String toString() {
////		return "Address [aid=" + aid + ", place=" + place + ", pincode=" + pincode + ", company=" + company + "]";
//		return "Address [aid=" + aid + ", place=" + place + ", pincode=" + pincode +  "]";
//	}
//	
//	
//}