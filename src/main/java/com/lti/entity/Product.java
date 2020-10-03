package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	public int getpID() {
		return pID;
	}


	public void setpId(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDetails() {
		return pDetails;
	}


	public void setpDetails(String pDetails) {
		this.pDetails = pDetails;
	}


	public double getpRate() {
		return pRate;
	}
	public void setpRate(double pRate) {
		this.pRate = pRate;
	}
}
