package org.jsp.hibernate_project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsp.hibernate_project.dao.CompanyDao;
import org.jsp.hibernate_project.dto.Address;
import org.jsp.hibernate_project.dto.Company;
import org.jsp.hibernate_project.dto.Employee;
import org.jsp.hibernate_project.dto.Laptops;
import org.jsp.hibernate_project.dto.Skills;


public class CompanyController {

    static Scanner sc = new Scanner(System.in);
    static CompanyDao dao = new CompanyDao();
    
    
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Company");
            System.out.println("2. Address");
            System.out.println("3. Employee");
            System.out.println("4. Laptop");
            System.out.println("5. Skills");
            System.out.println("6. Exit");

            System.out.print("Select Option: ");
            try {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: company();
                        break;
                case 2: address();
                        break;
                case 3: employee();
                        break;
                case 4: laptop();
                        break;
                case 5: skills();
                        break;
                case 6: 
                    System.out.println("Application Closed ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
           }
            catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }

            
        }
    }
    
    
 

    /* ================= COMPANY ================= */
    
    
    
   public static void company() {
        while (true) {
            System.out.println("------ Company Menu ------");
            System.out.println("1. Save Company ");
            System.out.println("2. Update Company Name");
            System.out.println("3. Delete Company");
            System.out.println("4. Find Company by ID");
            System.out.println("5. Fetch All Companies");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Company company = new Company();
                    System.out.print("Enter Company Name: ");
                    company.setName(sc.next());

                    // Address
                    Address address = new Address();
                    System.out.print("Enter Place: ");
                    address.setPlace(sc.next());
                    System.out.print("Enter Pincode: ");
                    address.setPincode(sc.nextInt());
                    company.setAddress(address);

                    // Employees
                    List<Employee> employees = new ArrayList<>();
                    System.out.print("How many employees? ");
                    int empCount = sc.nextInt();
                    for (int i = 0; i < empCount; i++) {
                        Employee e = new Employee();
                        System.out.print("Enter Employee Name: ");
                        e.setName(sc.next());
                        System.out.print("Enter Salary: ");
                        e.setSalary(sc.nextDouble());
                        e.setCompany(company); // set relation
                        employees.add(e);
                    }
                    company.setEmployee(employees);

                    // Laptops
                    List<Laptops> laptops = new ArrayList<>();
                    System.out.print("How many laptops? ");
                    int lapCount = sc.nextInt();
                    for (int i = 0; i < lapCount; i++) {
                        Laptops l = new Laptops();
                        System.out.print("Enter Laptop Name: ");
                        l.setName(sc.next());
                        System.out.print("Enter Laptop Price: ");
                        l.setCost(sc.nextDouble());
                        l.setCompany(company); // set relation
                        laptops.add(l);
                    }
                    company.setLaptop(laptops);

                    dao.saveCompany(company);
                    break;

                case 2:
                    System.out.print("Enter Company ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    dao.updateCompanyName(id, newName);
                    break;

                case 3:
                    System.out.print("Enter Company ID to delete: ");
                    dao.deleteCompany(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Company ID: ");
                    dao.findCompanyById(sc.nextInt());
                    break;

                case 5:
                    dao.fetchCompany();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    
    
  
    

    /* ================= ADDRESS ================= */
    public static void address() {
        while (true) {
            System.out.println("\n--- Address Menu ---");
            System.out.println("1. Save Address");
            System.out.println("2. Update Address Pincode");
            System.out.println("3. Delete Address");
            System.out.println("4. Find Address By Id");
            System.out.println("5. Fetch All Address");
            System.out.println("6. Back to Main Menu");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    Address a = new Address();
                    System.out.print("Place: ");
                    a.setPlace(sc.next());
                    System.out.print("Pincode: ");
                    a.setPincode(sc.nextInt());
                    dao.saveAddress(a);
                    break;   // ✅ stop here, go back to menu loop
                }
                case 2: {
                    System.out.print("Address Id: ");
                    int id = sc.nextInt();
                    System.out.print("New Pincode: ");
                    dao.updateAddressName(id, sc.nextInt());
                    break;
                }
                case 3:
                    System.out.print("Enter Address ID to delete: ");
                    dao.deleteAddress(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Address ID: ");
                    dao.findAddressById(sc.nextInt());
                    break;
                case 5:
                    dao.fetchAddress();
                    break;
                case 6:
                    return; 
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    /* ================= EMPLOYEE ================= */
   public  static void employee() {
    	while (true) {
            System.out.println("------ Employee Menu ------");
            System.out.println("1. Save Employee");
            System.out.println("2. Update Employee Name");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employee by ID");
            System.out.println("5. Fetch All Employees");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Employee e = new Employee();
                    System.out.print("Enter Name: ");
                    e.setName(sc.next());
                    System.out.print("Enter Salary: ");
                    e.setSalary(sc.nextDouble());
                    dao.saveEmployee(e);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    dao.updateEmployeeName(id, newName);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    dao.deleteEmployee(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    dao.findEmployeeById(sc.nextInt());
                    break;
                case 5:
                    dao.fetchEmployee();
                    break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }

        }
    }

    /* ================= LAPTOP ================= */
   public static void laptop() {
    	while (true) {
            System.out.println("------ Laptop Menu ------");
            System.out.println("1. Save Laptop");
            System.out.println("2. Update Laptop Name");
            System.out.println("3. Delete Laptop");
            System.out.println("4. Find Laptop by ID");
            System.out.println("5. Fetch All Laptops");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Laptops laptop = new Laptops();
                    System.out.print("Enter Laptop Name: ");
                    laptop.setName(sc.next());
                    System.out.print("Enter Laptop Cost: ");
                    laptop.setCost(sc.nextDouble());
                    dao.saveLaptop(laptop);
                    break;
                case 2:
                    System.out.print("Enter Laptop ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    dao.updateLaptopsName(id, newName);
                    break;
                case 3:
                    System.out.print("Enter Laptop ID to delete: ");
                    dao.deleteLaptops(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Laptop ID: ");
                    dao.findLaptopsById(sc.nextInt());
                    break;
                case 5:
                    dao.fetchLaptops();
                    break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }

        }
    }

    /* ================= SKILLS ================= */
   public static void skills() {
    	while (true) {
            System.out.println("------ Skills Menu ------");
            System.out.println("1. Save Skill");
            System.out.println("2. Update Skill Name");
            System.out.println("3. Delete Skill");
            System.out.println("4. Find Skill by ID");
            System.out.println("5. Fetch All Skills");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Skills skill = new Skills();
                    System.out.print("Enter Skill Name: ");
                    skill.setName(sc.next());
                    dao.saveSkills(skill);
                    break;
                case 2:
                    System.out.print("Enter Skill ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    String newName = sc.next();
                    dao.updateSkillsName(id, newName);
                    break;
                case 3:
                    System.out.print("Enter Skill ID to delete: ");
                    dao.deleteSkills(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Skill ID: ");
                    dao.findSkillsById(sc.nextInt());
                    break;
                case 5:
                    dao.fetchSkills();
                    break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }

            
        }
    }
}





























