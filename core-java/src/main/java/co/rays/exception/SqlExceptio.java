package co.rays.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlExceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj4", "root", "root");
			
		} catch (SQLException ex) {
			
			System.out.println(ex);
			
		} finally {
		//	System.out.println("abc");
			try {
				con.close(); // throws an exception
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}