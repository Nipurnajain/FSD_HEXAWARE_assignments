package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //step 1 
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db","root","Nipurna@123");  //step 2
		
			//String sql="insert into Employees(eid,ename,salary,job) values(112,'Don',410000,'MD')";   //STEP 3
			//String sql="update Employees set Commision=500 where Eid=111";
			 String sql="delete from employees where eid=112";
			 //UPDATE,DELETE
			Statement stmt=conn.createStatement();
			
			int count=stmt.executeUpdate(sql);              // step 4
			
			System.out.println(count+ " records updated");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();                     //step 5
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
