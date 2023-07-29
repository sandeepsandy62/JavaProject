package com.atm.dao;

import java.sql.SQLException;

public interface userDao {
	public boolean userLogin(String userEmail ,String userPassword) throws ClassNotFoundException, SQLException;
	public void userLogout();
}
