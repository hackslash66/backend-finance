package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author surya
 *
 * @version 1.8
 */

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@Column(name = "pId", length = 10)
	private int pID;
	
	@Column(name="pname",length = 30)
	private String pName;
	
	@Column(name="pdetails",length = 200)
	private String pDetails;
	
	@Column
	private double pRate;
	
	
	
	public int getPid() {
		return pID;
	}
	public void setPid(int pid) {
		this.pID = pid;
	}
	
	public String getPname() {
		return pName;
	}
	public void setPname(String pname) {
		this.pName = pname;
	}
	
	public String getPdetails() {
		return pDetails;
	}
	public void setPdetails(String pdetails) {
		this.pDetails = pdetails;
	}
	
	public double getPrate() {
		return pRate;
	}
	public void setPrate(double prate) {
		this.pRate = prate;
	}
	
	
}
