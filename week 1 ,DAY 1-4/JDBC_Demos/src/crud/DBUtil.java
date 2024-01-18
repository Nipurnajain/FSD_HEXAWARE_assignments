package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {                     //factory class
    static Connection conn=null;
	public static Connection getdbConnection() {                //factory method
		
		try {
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");  //step 1 
			
			//step2
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db","root","Nipurna@123");  //step 2
		
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
	
}
