package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {

    public  boolean testConnection(){
        String url = "jdbc:mysql://localhost:3306/StudentRegistration"; // No spaces
        String user = "root";
        String password = "Olivier@@96";
        try{
            Connection connection= DriverManager.getConnection(url,user,password);
            return true;
        }catch(Exception ex){
           ex.printStackTrace();;
        }
        return false;
    }
}