package com.studyskymate.dinesh.java.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataEx {

	public static void main(String[] args) {
		try {
			
		    Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CEIT-SRV-1.fnu.local:1521/orcl.fnu.local","hr","hr");
			Statement statement=con.createStatement();
			
			 int result= statement.executeUpdate("INSERT INTO EMPLOYEE VALUES ('508','Dinesh')");
			 
			 System.out.println("result: "+result);
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	}


