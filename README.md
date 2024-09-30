Student Registration System
Overview
This project is a Java-based application that allows for the management of student records in a relational database. It supports operations such as creating, reading, updating, and deleting student entries. 
The application uses JDBC for database connectivity and follows basic DAO (Data Access Object) design principles.

Features
Add new student records
Update existing student information
Retrieve student details
Delete student records
Technologies Used
----------------
Java 
MySQL (or any relational database)
JDBC (Java Database Connectivity)
Maven (for project management and dependencies)
Technology
Java Development Kit (JDK): Ensure you have JDK 11 or higher installed on your machine.
MySQL Server: Install MySQL Server and create a database for this project.
JDBC Driver: Include the MySQL JDBC driver in your project.
Database Setup
--------------
Create a MySQL database (e.g., student_db).

Run the following SQL command to create the Student table:

sql
----

CREATE TABLE Student (
    student_ID INT PRIMARY KEY,
    student_name VARCHAR(255) NOT NULL,
    Faculty VARCHAR(255) NOT NULL,
    Department VARCHAR(255) NOT NULL,
    registration_date DATE
);
Configuration
Update the database connection details in the StudentDAO class:

java

private String url = "jdbc:mysql://localhost:3306/your_database"; // Update with your DB URL
private String user = "your_username"; // Update with your DB username
private String password = "your_password"; // Update with your DB password
Usage
Adding a Student
To add a new student, create an instance of StudentDAO and call the appropriate method:

UPDATING STUDENT
-----------------

StudentDAO dao = new StudentDAO();
dao.addStudent(new Student(1, "John Doe", "Engineering", "Computer Science", Date.valueOf("2024-09-30")));
Updating a Student
To update an existing student, call the updateStudent method:

READING STUDENT
---------------

dao.updateStudent(1, "Jane Doe", "Engineering", "Software Engineering", Date.valueOf("2024-10-01"));
Reading a Student
To read a student's details, implement a method in the StudentDAO class to retrieve student data based on the student ID.

Deleting a Student
------------------
To delete a student record, implement a method in the StudentDAO class that executes a DELETE SQL command based on the student ID.

Testing
-----------
Unit Testing
I have used junit 4 api with suite case in order to test all test cases at the same time
