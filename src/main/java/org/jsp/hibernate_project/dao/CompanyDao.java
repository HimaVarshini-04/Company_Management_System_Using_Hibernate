package org.jsp.hibernate_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.hibernate_project.dto.Address;
import org.jsp.hibernate_project.dto.Company;
import org.jsp.hibernate_project.dto.Employee;
import org.jsp.hibernate_project.dto.Laptops;
import org.jsp.hibernate_project.dto.Skills;

public class CompanyDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	public void saveCompany(Company company) {
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	public void updateCompanyName(int companyId, String newName) {
	    entityTransaction.begin();

	    Company company = entityManager.find(Company.class, companyId);
	    if (company != null) {
	        company.setName(newName);
	    }

	    entityTransaction.commit();
	}
	public void deleteCompany(int id) {
	    Company company = entityManager.find(Company.class, id);
	    if (company != null) {
	    	entityTransaction.begin();
	    	entityManager.remove(company);
	    	entityTransaction.commit();
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	public void findCompanyById(int id) {
	    Company company = entityManager.find(Company.class, id);
	    if (company != null) {
	    	System.out.println(company);
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	public void fetchCompany() {
		Query query = entityManager.createQuery("select company from Company company");
		List<Company> list = query.getResultList();
		for(Object object : list) {
			System.out.println(object);
		}
	}
	
	// CRUD OPERATIONS FOR EMPLOYEE:
	
	public void saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void updateEmployeeName(int employeeId, String newName) {
	    entityTransaction.begin();

	    Employee employee = entityManager.find(Employee.class, employeeId);
	    if (employee != null) {
	        employee.setName(newName);
	    }

	    entityTransaction.commit();
	}
	
	public void deleteEmployee(int id) {
		Employee employee  = entityManager.find(Employee.class, id);
	    if (employee != null) {
	    	entityTransaction.begin();
	    	entityManager.remove(employee);
	    	entityTransaction.commit();
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	
	public void findEmployeeById(int id) {
	    Employee employee = entityManager.find(Employee.class, id);
	    if (employee != null) {
	    	System.out.println(employee);
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	
	public void fetchEmployee() {
		Query query = entityManager.createQuery("select employee from Employee employee");
		List<Employee> list = query.getResultList();
		for(Object object : list) {
			System.out.println(object);
		}
	}
	
	// CRUD OPERATIONS FOR LAPTOP:
	
	public void saveLaptop(Laptops laptop) {
		entityTransaction.begin();
		entityManager.persist(laptop);
		entityTransaction.commit();
	}
	
	public void updateLaptopsName(int laptopId, String newName) {
	    entityTransaction.begin();

	    Laptops laptop = entityManager.find(Laptops.class, laptopId);
	    if (laptop != null) {
	        laptop.setName(newName);
	    }

	    entityTransaction.commit();
	}
	
	public void deleteLaptops(int id) {
		Laptops laptop  = entityManager.find(Laptops.class, id);
	    if (laptop != null) {
	    	entityTransaction.begin();
	    	entityManager.remove(laptop);
	    	entityTransaction.commit();
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	
	public void findLaptopsById(int id) {
		Laptops laptop = entityManager.find(Laptops.class, id);
	    if (laptop != null) {
	    	System.out.println(laptop);
	    }
	    else {
	    	System.out.println("record not found");
	    }
	}
	
	public void fetchLaptops() {
		Query query = entityManager.createQuery("select laptop from Laptops laptops");
		List<Laptops> list = query.getResultList();
		for(Object object : list) {
			System.out.println(object);
		}
	}
	
	// CRUD OPERATIONS FOR SKILLS:
	
		public void saveSkills(Skills skills) {
			entityTransaction.begin();
			entityManager.persist(skills);
			entityTransaction.commit();
		}
		
//		public void saveSkills(List<Skills> skillsList) {
//		    
//		    entityTransaction.begin();
//		    for (Skills s : skillsList) {
//		        entityManager.persist(s);
//		    }
//		    entityTransaction.commit();
//		    entityManager.close();
//		}
		
		public void updateSkillsName(int skillsId, String newName) {
		    entityTransaction.begin();

		    Skills skills = entityManager.find(Skills.class, skillsId);
		    if (skills != null) {
		        skills.setName(newName);
		    }

		    entityTransaction.commit();
		}
		
		public void deleteSkills(int id) {
			Skills skills  = entityManager.find(Skills.class, id);
		    if (skills != null) {
		    	entityTransaction.begin();
		    	entityManager.remove(skills);
		    	entityTransaction.commit();
		    }
		    else {
		    	System.out.println("record not found");
		    }
		}
		
		public void findSkillsById(int id) {
			Skills skills = entityManager.find(Skills.class, id);
		    if (skills != null) {
		    	System.out.println(skills);
		    }
		    else {
		    	System.out.println("record not found");
		    }
		}
		
		public void fetchSkills() {
			Query query = entityManager.createQuery("select skills from Skills skills");
			List<Skills> list = query.getResultList();
			for(Object object : list) {
				System.out.println(object);
			}
		}
		
		// CRUD OPERATIONS FOR Address:
		
			public void saveAddress(Address address) {
				entityTransaction.begin();
				entityManager.persist(address);
				entityTransaction.commit();
			}
			
			public void updateAddressName(int addressId, int pincode) {
			    entityTransaction.begin();

			    Address address = entityManager.find(Address.class, addressId);
			    if (address != null) {
			        address.setPincode(pincode);
			    }

			    entityTransaction.commit();
			}
			
			public void deleteAddress(int id) {
				Address address  = entityManager.find(Address.class, id);
			    if (address != null) {
			    	entityTransaction.begin();
			    	entityManager.remove(address);
			    	entityTransaction.commit();
			    }
			    else {
			    	System.out.println("record not found");
			    }
			}
			
			public void findAddressById(int id) {
				Address address = entityManager.find(Address.class, id);
			    if (address != null) {
			    	System.out.println(address);
			    }
			    else {
			    	System.out.println("record not found");
			    }
			}
			
			public void fetchAddress() {
				Query query = entityManager.createQuery("select address from Address address");
				List<Address> list = query.getResultList();
				for(Object object : list) {
					System.out.println(object);
				}
			}

			
	
	
}
























































//package org.jsp.hibernate_project.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import org.jsp.hibernate_project.dto.Address;
//import org.jsp.hibernate_project.dto.Company;
//import org.jsp.hibernate_project.dto.Employee;
//import org.jsp.hibernate_project.dto.Laptops;
//import org.jsp.hibernate_project.dto.Skills;
//
//public class CompanyDao
//{
//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
//	EntityManager entityManager = entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction = entityManager.getTransaction();
//	public void saveCompany(Company company) {
//		entityTransaction.begin();
//		entityManager.persist(company);
//		entityTransaction.commit();
//	}
//	public void updateCompanyName(int companyId, String newName)
//	{
//	    entityTransaction.begin();
//
//	    Company company = entityManager.find(Company.class, companyId);
//	    if (company != null) {
//	        company.setName(newName);
//	    }
//
//	    entityTransaction.commit();
//	}
//	public void deleteCompany(int id)
//	{
//	    Company company = entityManager.find(Company.class, id);
//	    if (company != null) {
//	    	entityTransaction.begin();
//	    	entityManager.remove(company);
//	    	entityTransaction.commit();
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void findCompanyById(int id) {
//	    Company company = entityManager.find(Company.class, id);
//	    if (company != null) {
//	    	System.out.println(company);
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void fetchCompany() {
//		Query query = entityManager.createQuery("select company from Company company");
//		List<Company> list = query.getResultList();
//		for(Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//	// for address
//	public void saveAddress(Address address)
//	{
//		entityTransaction.begin();
//		entityManager.persist(address);
//		entityTransaction.commit();
//	}
//	
//	public void updateAddress(int addressId, String newPlace)
//	{
//	    entityTransaction.begin();
//
//	    Address address = entityManager.find(Address.class, addressId);
//	    if (address!= null) {
//	    	address.setPlace(newPlace);
//	    }
//
//	    entityTransaction.commit();
//	}
//	
//	public void deleteAddress(int id)
//	{
//		Address address = entityManager.find(Address.class, id);
//	    if (address != null) {
//	    	entityTransaction.begin();
//	    	entityManager.remove(address);
//	    	entityTransaction.commit();
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	
//	public void findAddress(int id) {
//		Address address = entityManager.find(Address.class, id);
//	    if (address != null) {
//	    	System.out.println(address);
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void fetchAddress() 
//	{
//		Query query = entityManager.createQuery("select address from Address address");
//		List<Address> list = query.getResultList();
//		for(Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//	
////	 For Employee
//	
//	public void saveEmployee(Employee employee)
//	{
//		entityTransaction.begin();
//		entityManager.persist(employee);
//		entityTransaction.commit();
//	}
//	
//	public void updateEmployee(int employeeId, String newName)
//	{
//	    entityTransaction.begin();
//
//	    Employee employee = entityManager.find(Employee.class, employeeId);
//	    if (employee != null) {
//	        employee.setName(newName);
//	    }
//
//	    entityTransaction.commit();
//	}
//	
//	public void deleteEmployee(int id)
//	{
//		Employee employee = entityManager.find(Employee.class, id);
//	    if (employee != null) {
//	    	entityTransaction.begin();
//	    	entityManager.remove(employee);
//	    	entityTransaction.commit();
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	
//	public void findEmployee(int id) {
//		Employee employee = entityManager.find(Employee.class, id);
//	    if (employee != null) {
//	    	System.out.println(employee);
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void fetchEmployee() 
//	{
//		Query query = entityManager.createQuery("select employee from Employee employee");
//		List<Employee> list = query.getResultList();
//		for(Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//	
//	// for laptops
//	
//	public void saveLaptops(Laptops laptops)
//	{
//		entityTransaction.begin();
//		entityManager.persist(laptops);
//		entityTransaction.commit();
//	}
//	
//	public void updateLaptops(int laptopsId, String newName)
//	{
//	    entityTransaction.begin();
//
//	    Laptops laptops = entityManager.find(Laptops.class, laptopsId);
//	    if (laptops != null) {
//	        laptops.setName(newName);
//	    }
//
//	    entityTransaction.commit();
//	}
//	
//	public void deleteLaptops(int id)
//	{
//		Laptops laptops = entityManager.find(Laptops.class, id);
//	    if (laptops != null) {
//	    	entityTransaction.begin();
//	    	entityManager.remove(laptops);
//	    	entityTransaction.commit();
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	
//	public void findLaptops(int id) {
//		Laptops laptops = entityManager.find(Laptops.class, id);
//	    if (laptops != null) {
//	    	System.out.println(laptops);
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void fetchLaptops() 
//	{
//		Query query = entityManager.createQuery("select laptops from Laptops laptops");
//		List<Laptops> list = query.getResultList();
//		for(Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//	public void saveSkills(Skills skills )
//	{
//		entityTransaction.begin();
//		entityManager.persist(skills);
//		entityTransaction.commit();
//	}
//	
//	public void updateSkills(int skillsId, String newName)
//	{
//	    entityTransaction.begin();
//
//	    Skills skills = entityManager.find(Skills.class, skillsId);
//	    if (skills != null) {
//	        skills.setName(newName);
//	    }
//
//	    entityTransaction.commit();
//	}
//	
//	public void deleteSkills(int id)
//	{
//		Skills skills = entityManager.find(Skills.class, id);
//	    if (skills != null) {
//	    	entityTransaction.begin();
//	    	entityManager.remove(skills);
//	    	entityTransaction.commit();
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	
//	public void findSkills(int id) {
//		Skills skills = entityManager.find(Skills.class, id);
//	    if (skills != null) {
//	    	System.out.println(skills);
//	    }
//	    else {
//	    	System.out.println("record not found");
//	    }
//	}
//	public void fetchLSkills() 
//	{
//		Query query = entityManager.createQuery("select skills from Skills skills");
//		List<Skills> list = query.getResultList();
//		for(Object object : list) {
//			System.out.println(object);
//		}
//	}
//	
//	
//}