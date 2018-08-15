package com.carpool.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.carpool.DBCONFIG.DatabaseConfig;

import com.carpool.MODEL.SignUpModel;

public class Register {
	
	public String RegisterUser(SignUpModel wamp)
	{
		String emailid = wamp.getEmailid();
		String password = wamp.getPassword();
		
		DatabaseConfig db = new DatabaseConfig();
		Connection con = null;
		Statement smt = null;
		ResultSet rs = null;
		
		
		
		try
		{
			con = db.createConnection();
			smt = con.createStatement();
			
			rs=smt.executeQuery("insert into registrable values( emailid='"+emailid+"' , password='"+password+"')");
			
			while(rs.next())
			{
				
					return "Success";
					
				
					
			}
				
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
		return "Invalid user Credintials";
	}

}
