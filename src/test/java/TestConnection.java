import Dao.RegisterStudent;
import DatabaseConnectivity.Connectivity;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestConnection {
    static Connectivity con = new Connectivity();
    RegisterStudent registerStudent = new RegisterStudent();
    @Test
    public void testConnection(){

        boolean result=con.testConnection();
        assertTrue(result);
        System.out.println("loading Connection");
    }
    @Test
    public void loadingConnectionTest(){
        System.out.println("Connection is working");
    }

    @Test
    public void testSaveStudent() throws SQLException {
        // Arrange


        // Act
        registerStudent.saveStudent();
//        String URL = "jdbc:mysql://localhost:3306/StudentRegistration"; // Your database URL
//        String USER = "root"; // Your database username
//        String PASSWORD = "Olivier@@96"; // Your database password
//
//        // Assert
//        // Now, check if the student data is actually present in the database
//        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            String sql = "SELECT * FROM Student WHERE student_ID = ?";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setInt(1, 24336); // The ID you inserted
//                ResultSet resultSet = preparedStatement.executeQuery();
//                assertTrue(resultSet.next()); // Should return true if a row is found
//                assertEquals("Bosco", resultSet.getString("student_name"));
//                assertEquals("IT", resultSet.getString("Department"));
//                assertEquals("Networking", resultSet.getString("Faculty"));
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Test
    public void testUpdate() throws SQLException {
      registerStudent.updateStudent();

    }
}
