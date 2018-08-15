package com.carpool.MODEL;

public class SignUpModel {

	private String emailid;
	private String password;
	private String confirmpassword;
	
	public String getConfirmPassword()
	{
		return confirmpassword;
	}
	public void setConfirmPassword(String confirmpassword)
	{
		this.confirmpassword=confirmpassword;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}


