package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author venkat
 *
 * @version 1.8
 */

@Entity
@Table(name = "admin_cred")
public class Admin {
	@Id
	@Column(name = "admin_UserID")
	private String adminUserID;
	
	@Column(name = "admin_Pwd")
	private String adminPwd;
	
	@Column(name = "admin_Name")
	private String adminName;

	public String getAdminUserID() {
		return adminUserID;
	}

	public void setAdminUserID(String adminUserID) {
		this.adminUserID = adminUserID;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
}
