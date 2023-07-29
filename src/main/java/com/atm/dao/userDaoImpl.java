package com.atm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDaoImpl implements userDao {
	
	private String url = "jdbc:mysql://localhost:3306/atm";
	private String username = "root";
	private String password = "root";
	
	
	@Override
	public boolean userLogin(String userEmail , String userPassword) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String query = "insert into users values(?,?,?,?)";
		Connection conn = DriverManager.getConnection(url,username,password);
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1, userEmail);
		statement.setString(2, userPassword);
		statement.setString(3, "123");
		statement.setInt(4, 2000);
		
		int rs = statement.executeUpdate();
		
		if(rs >= 1) {
			return true;
		}
		
		System.out.println("Executed " + rs + " rows");
		
		return false;
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}
}
