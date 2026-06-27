package org.jsp.hibernate_project.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Laptops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String name;
	private double cost;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="laptop")
	private Employee employee;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Company company;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
//		return "Laptops [lid=" + lid + ", name=" + name + ", cost=" + cost + ", company=" + company + "]";
		return "Laptops [lid=" + lid + ", name=" + name + ", cost=" + cost + "Employee=" + employee + "]";
	}
	
	
}
























//
//package org.jsp.hibernate_project.dto;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//@Entity
//public class Laptops {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int lid;
//	private String name;
//	private double cost;
//	
////	@OneToOne(cascade=CascadeType.ALL,mappedBy="laptop")
//	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE},mappedBy="laptop")
//	private Employee employee;
//	
////	@ManyToOne(cascade=CascadeType.ALL)
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	@JoinColumn
//	private Company company;
//
//	public int getLid() {
//		return lid;
//	}
//
//	public void setLid(int lid) {
//		this.lid = lid;
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
//	public double getCost() {
//		return cost;
//	}
//
//	public void setCost(double cost) {
//		this.cost = cost;
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
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	@Override
//	public String toString() {
////		return "Laptops [lid=" + lid + ", name=" + name + ", cost=" + cost + ", company=" + company + "]";
//		return "Laptops [lid=" + lid + ", name=" + name + ", cost=" + cost + "Employee=" + employee + "]";
//	}
//	
//	
//}