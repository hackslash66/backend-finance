package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "emi_card")
public class Emicard {
	@Id
	@Column(name = "reg_no", length = 16)
	private String cardNo;
	@Column(name = "issue_date", length = 20)
	private String issuedate;
	@Column(name = "expiry_date", length = 20)
	private String expirydate;
	@Column(name = "emi_limit", length = 20)
	private double emilimit;
	
	@OneToOne
	@JoinColumn(name = "uname")
	User u;

	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Product> products = new ArrayList<Product>();

	public String getCardNo() {
		return cardNo;
	}


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public String getIssuedate() {
		return issuedate;
	}


	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}


	public String getExpirydate() {
		return expirydate;
	}


	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}


	public User getU() {
		return u;
	}


	public void setU(User u) {
		this.u = u;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public double getEmilimit() {
		return emilimit;
	}


	public void setEmilimit(double emilimit) {
		this.emilimit = emilimit;
	}
	
	
}
