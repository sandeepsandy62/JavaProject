package com.atm.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atm.services.userService;


@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("newPassword");
		
		userService userLoginService = new userService();
		
		boolean status = userLoginService.userLogin(userEmail, userPassword);
		RequestDispatcher rd = request.getRequestDispatcher("accNum.jsp");
		request.setAttribute("message", "Account Number Generated 123");
		
		if(status == true) {
			rd.forward(request, response);
		}
		
	}

}
