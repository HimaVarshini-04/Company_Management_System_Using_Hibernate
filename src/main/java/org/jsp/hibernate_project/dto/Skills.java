package org.jsp.hibernate_project.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="skills")
	private List<Employee> employee;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
//		return "Skills [sid=" + sid + ", name=" + name + ", employee=" + employee + "]";
		return "Skills [sid=" + sid + ", name=" + name +  "]";
	}
	
	
}









//package org.jsp.hibernate_project.dto;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Skills {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int sid;
//	private String name;
//	
////	@ManyToMany(cascade=CascadeType.ALL,mappedBy="skills")
//	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE},mappedBy="skills")
//	
//	private List<Employee> employee;
//
//	public int getSid() {
//		return sid;
//	}
//
//	public void setSid(int sid) {
//		this.sid = sid;
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
////		return "Skills [sid=" + sid + ", name=" + name + ", employee=" + employee + "]";
//		return "Skills [sid=" + sid + ", name=" + name +  "]";
//	}
//	
//	
//}