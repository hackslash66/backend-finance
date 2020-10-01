package com.lti.pojo;

/**
 * @author Surya
 *
 * @version 1.8
 */

public class Login {
	
	private String uname;
	private String pwd;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
