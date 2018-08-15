package com.carpool.CONTROLLER;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carpool.DAO.*;
import com.carpool.MODEL.*;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("Email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("cpassword");
		
		SignUpModel si = new SignUpModel();
		si.setEmailid(email);
		si.setPassword(password);
		si.setConfirmPassword(confirmpassword);
		
		Register user = new Register();
		String userValidate = user.RegisterUser(si);
		
 System.err.println(userValidate);
		 
		 if(userValidate.equalsIgnoreCase("success"))
		 {
			 HttpSession httpSession=request.getSession();
			 
			 httpSession.setAttribute("EmailID", email);

			 response.sendRedirect("Login.jsp");
		 }
		 else
		 {
			 request.setAttribute("ErrorMsg", userValidate);
			 request.getRequestDispatcher("/Login.jsp").include(request, response);
		 }

	}
	 
	}