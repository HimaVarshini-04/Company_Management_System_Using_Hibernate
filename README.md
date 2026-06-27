# Company Management System using Hibernate ORM

## Overview

Developed a console-based Company Management System using Java, Hibernate ORM, and MySQL to efficiently manage company-related data. 
The application supports CRUD operations for Company, Employee, Laptop, Skills, and Address modules.
It demonstrates real-world database relationships such as One-to-One, One-to-Many, Many-to-One, and Many-to-Many using JPA annotations and Hibernate ORM.
The application performs CRUD operations while managing these relationships efficiently using Hibernate's ORM capabilities,EntityManager API, cascade operations, 
and bidirectional mapping.
The project showcases object-relational mapping (ORM), entity relationship management, data persistence, and database operations without writing SQL queries manually.

---

## Technologies Used

- Java
- Hibernate ORM
- JPA (Java Persistence API)
- MySQL
- JDBC
- EntityManager API
- JPQL
- Maven
- Eclipse IDE
- Collections Framework
- Exception Handling

---

## Features

- Company Management
- Employee Management
- Laptop Management
- Skills Management
- Address Management
- Menu-driven Console Application
- CRUD Operations
- Hibernate ORM-based Persistence
- Automatic Cascade Operations
- Bidirectional Entity Mapping
- JPQL Queries for Data Retrieval

---

## Database Relationships

- One-to-One
  - Company ↔ Address
  - Employee ↔ Laptop

- One-to-Many
  - Company → Employees
  - Company → Laptops

- Many-to-One
  - Employee → Company
  - Laptop → Company

- Many-to-Many
  - Employee ↔ Skills

---

## Workflow

1. User selects a module from the main menu.
2. Performs CRUD operations on Company, Employee, Laptop, Skills, or Address.
3. Controller receives user input.
4. DAO layer processes database operations using EntityManager.
5. Hibernate maps Java objects to database tables.
6. Data is stored and retrieved from MySQL.

---

## Modules

- Company
- Employee
- Laptop
- Skills
- Address

---

## Application

Run the following class:

```bash
CompanyController.java

```

The application starts with a menu-driven console interface.

---

## Hibernate Concepts Implemented

- Entity Mapping
- One-to-One Mapping
- One-to-Many Mapping
- Many-to-One Mapping
- Many-to-Many Mapping
- Cascade Operations
- Bidirectional Mapping
- EntityManager API
- JPQL Queries
- CRUD Operations

---

## Future Enhancements

- Integrate the project with Spring Boot.
- Develop REST APIs for CRUD operations.
- Implement User Authentication and Authorization.
- Add Role-Based Access Control (Admin/User).
- Build a responsive web interface using React.
- Improve logging and exception handling for better maintainability.

---

## Author

**Hima Varshini Sai**
