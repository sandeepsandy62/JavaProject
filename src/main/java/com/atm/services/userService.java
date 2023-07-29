package com.atm.services;
import java.sql.SQLException;

import com.atm.dao.*;

public class userService {
	
	public boolean userLogin(String userEmail , String userPassword) {
		userDao userDaoObject = new userDaoImpl();
		
		try {
			boolean status = userDaoObject.userLogin(userEmail, userPassword);
			
			if(status == true) {
				return true;
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void userLogout() {
		
	}
	
	public void userCheckBalance(String accountNumber , int atmPin) {
		
	}
	
	public void transactionHistory(String accountNumber) {
		
	}
	
}
