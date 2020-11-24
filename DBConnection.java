package com.storydetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection createConnection() {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/Story";
		String username="root";
		String password="Vpk@2710";
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			con=DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
