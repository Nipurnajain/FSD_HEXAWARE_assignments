package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepStatementDemo {

	public static void main(String[] args) {
		
		Connection conn=DBUtil.getdbConnection();
		
		//insert
		
//		String query=" insert into dept values(?,?,?)";  //?=positional parameters
//        try {
//			PreparedStatement pstmt=conn.prepareStatement(query);
//			pstmt.setInt(1, 80);
//			pstmt.setString(2, "Logistics");
//			pstmt.setString(3, "Noida");
//			int count=pstmt.executeUpdate();
//			System.out.println(count);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
        
        
        
        //update
		
//        String query=" update dept set dname=?,location=? where dno=?";  //?=positional parameters
//        try {
//			PreparedStatement pstmt=conn.prepareStatement(query);
//			pstmt.setString(1, "Tours&Travels");
//			pstmt.setString(2, "Greater Noida");
//			pstmt.setInt(3, 80);
//			int count=pstmt.executeUpdate();
//			System.out.println(count);
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
        
        //select
		
        //String query="select dno,dname,location from dept where dno>?";  //?=positional parameters
        
//		String selectAll="select dno,dname,location from dept";
//		try {
//			PreparedStatement pstmt=conn.prepareStatement(selectAll);
//			
//			//pstmt.setInt(1, 50);
//			ResultSet rs=pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt("dno") +" "+rs.getString("dname")+" "+ rs.getString("location"));
//			}
//			
//			
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
		
		//delete
		
		String query="delete from dept where dno=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, 80);
		
			int rs= pstmt.executeUpdate();
			
			System.out.println("records deleted "+rs);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
