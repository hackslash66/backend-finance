package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "uname", length=15)
	private String uname;
	@Column(name = "email", length=15)
	private String email;
	@Column(name = "password",length=15)
	private String password;
	@Column(name = "phone",length=15)
	private String phone;
	@Column(name = "name",length=15)
	private String name;
	@Column(name = "account",length=20)
	private String account;
	@Column(name = "ifsc",length=15)
	private String ifsc;
	@Column(name = "address",length=15)
	private String address;
	@Column(name = "bank",length=15)
	private String bank;
	@Column(name = "card",length=15)
	private String card;
	@Column(name = "status",length=15)
	private String approvalstatus;
	
	
	@OneToMany(mappedBy = "user",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	//@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Product> products=new ArrayList<Product>();


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public String getCard() {
		return card;
	}


	public void setCard(String card) {
		this.card = card;
	}


	public String getApprovalstatus() {
		return approvalstatus;
	}


	public void setApprovalstatus(String approvalstatus) {
		this.approvalstatus = approvalstatus;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
