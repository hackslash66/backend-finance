package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "products")
public class Product {
	
	@Id
	private int pid;
	@Column(length = 30)
	private String pname;
	@Column(length = 200)
	private String pdetails;
	@Column
	private double prate;
	@ManyToOne
	@JoinColumn(name = "uname")
	private User user;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	
	public double getPrate() {
		return prate;
	}
	public void setPrate(double prate) {
		this.prate = prate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
