package Modle;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class Student {
    @Id

    private int student_ID;
    private String student_name;
    private String Faculty;
    private String Department;
    private Date registration_date;

    public Student() {
    }

    public Student(int student_ID, String student_name, String faculty, String department, Date registration_date) {
        this.student_ID = student_ID;
        this.student_name = student_name;
        Faculty = faculty;
        Department = department;
        this.registration_date = registration_date;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public java.sql.Date getRegistration_date() {
        return (java.sql.Date) registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }
}
