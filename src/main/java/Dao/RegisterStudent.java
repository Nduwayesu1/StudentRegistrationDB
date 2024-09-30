package Dao;

import Modle.Student;

import java.sql.*;

public class RegisterStudent {

    private static final String URL = "jdbc:mysql://localhost:3306/StudentRegistration"; // Your database URL
    private static final String USER = "root"; // Your database username
    private static final String PASSWORD = "Olivier@@96"; // Your database password
    Student student = new Student();
    public void saveStudent() throws SQLException {
        // Hardcoded student information

        student.setStudent_ID(24339);
        student.setStudent_name("Kanosa");
        student.setDepartment("Networking");
        student.setFaculty("IT");
//        student.setRegistration_date(java.util.Date.from(java.time.LocalDate.of(2024, 9, 30)
//                .atStartOfDay(java.time.ZoneOffset.UTC).toInstant()));

        String dateString = "2024-12-30";
        student.setRegistration_date(Date.valueOf(dateString));

        String sql = "INSERT INTO Student (student_ID, student_name, Faculty, Department, registration_date) VALUES (?, ?, ?, ?, ?)";


        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, student.getStudent_ID());
            preparedStatement.setString(2, student.getStudent_name());
            preparedStatement.setString(3, student.getDepartment());
            preparedStatement.setString(4, student.getFaculty());
            preparedStatement.setDate(5, student.getRegistration_date());
            connection.setAutoCommit(false); // Disable auto-commit

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                connection.commit();
                System.out.println("Student saved successfully!");
            }
        else{
            System.out.println("ID NOT FOUND");
        }


    }

    public void  updateStudent() throws SQLException {

        student.setStudent_ID(243345);
        student.setStudent_name("Mugisha");
        student.setFaculty("Medecine");
        student.setDepartment("Nursing");
        String registration_date="2024-10-20";
        student.setRegistration_date(Date.valueOf(registration_date));
        //open connection
        Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
        // sql query
        String updateQuery = "UPDATE Student SET student_name = ?, Faculty = ?, Department = ?, registration_date = ? WHERE student_ID = ?";
        // Open Prepared Statement
        PreparedStatement pst=con.prepareStatement(updateQuery);
        pst.setString(1,student.getStudent_name());
        pst.setString(2,student.getFaculty());
        pst.setString(3,student.getDepartment());
        pst.setDate(4,student.getRegistration_date());
        pst.setInt(5,student.getStudent_ID());
        //execute statement
        int rowsAffected=pst.executeUpdate();
        con.setAutoCommit(false);
        if(rowsAffected >=0){
            con.commit();
            System.out.println("Data Updated Successful");
        }else{
            System.out.println("ID NOT FOUND");
        }
    }
}

