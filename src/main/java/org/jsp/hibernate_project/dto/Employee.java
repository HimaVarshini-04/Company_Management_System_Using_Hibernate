package org.jsp.hibernate_project.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private double salary;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Laptops laptop;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(joinColumns=@JoinColumn(name="eid"), inverseJoinColumns=@JoinColumn(name="lSid"))
	private List<Skills> skills;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Company company;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public Laptops getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptops laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
		
	}
	
	
	
}





















//
//
//package org.jsp.hibernate_project.dto;
//
//import java.util.List;
//
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Employee {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int eid;
//	private String name;
//	private double salary;
//	
//	@OneToOne(cascade=CascadeType.ALL)
//	private Laptops laptop;
//	
////	@ManyToMany(cascade=CascadeType.ALL)
//	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	@JoinTable(joinColumns=@JoinColumn(name="eid"), inverseJoinColumns=@JoinColumn(name="lSid"))
//	private List<Skills> skills;
//
////	@ManyToOne(cascade=CascadeType.ALL)
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//	
//	@JoinColumn
//	private Company company;
//
//	public int getEid() {
//		return eid;
//	}
//
//	public void setEid(int eid) {
//		this.eid = eid;
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
//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public List<Skills> getSkills() {
//		return skills;
//	}
//
//	public void setSkills(List<Skills> skills) {
//		this.skills = skills;
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
//	public Laptops getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptops laptop) {
//		this.laptop = laptop;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
//		
//	}
//	
//	
//	
//}