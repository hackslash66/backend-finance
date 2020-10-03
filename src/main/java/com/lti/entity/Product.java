package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author surya
 *
 * @version 1.8
 */

@Entity
@Table(name = "products")
@SequenceGenerator(name = "custseq", sequenceName = "seq_cust", initialValue = 1001, allocationSize = 1)
public class Product {

	@Id
	@Column(name = "pID", length = 10)
	@GeneratedValue(generator = "custseq", strategy = GenerationType.SEQUENCE)
	private int pID;

	@Column(name = "pName", length = 30)
	private String pName;

	@Column(name = "pDetails", length = 200)
	private String pDetails;

	@Column(name = "pRate", length = 10)
	private double pRate;

	@Column(name = "pImgSrc", length = 200)
	private String pImgSrc;

	public String getpImgSrc() {
		return pImgSrc;
	}

	public void setpImgSrc(String pImgSrc) {
		this.pImgSrc = pImgSrc;
	}

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
