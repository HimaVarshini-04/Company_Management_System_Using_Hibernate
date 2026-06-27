package org.jsp.hibernate_project.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="company")
	private List<Laptops> laptop;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="company")
	private List<Employee> employee;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Laptops> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptops> laptop) {
		this.laptop = laptop;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", address=" + address + ", laptop=" + laptop + ", employee="
				+ employee + "]";
	}
	
	
}



















//
//package org.jsp.hibernate_project.dto;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Company {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int cid;
//	private String name;
//	
////	@OneToOne(cascade=CascadeType.ALL)
//	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//
//	@JoinColumn
//	private Address address;
//	
////	@OneToMany(cascade=CascadeType.ALL,mappedBy="company")
//	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="company")
//
//	private List<Laptops> laptop;
//	
////	@OneToMany(cascade=CascadeType.ALL,mappedBy="company")
//	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="company")
//	private List<Employee> employee;
//
//	public int getCid() {
//		return cid;
//	}
//
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public List<Laptops> getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(List<Laptops> laptop) {
//		this.laptop = laptop;
//	}
//
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
//
//	@Override
//	public String toString() {
//		return "Company [cid=" + cid + ", name=" + name + ", address=" + address + ", laptop=" + laptop + ", employee="
//				+ employee + "]";
//	}
//	
//	
//}