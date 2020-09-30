package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "login", query = "FROM User WHERE uname=:uname AND pwd=:pwd")
@NamedQuery(name = "fetchifyes", query = "select u from User u where u.approvalstatus=:approvalstatus")
public class User {
	
	@Id
	@Column(name = "uname")
	private String uName;
	
	@Column(name = "email")
	private String Email;
	
	@Column(name = "pwd")
	private String Pwd;
	
	@Column(name = "contact")
	private String Contact;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "bankacct")
	private String BankAcct;
	
	@Column(name = "ifsc")
	private String Ifsc;
	
	@Column(name = "address")
	private String Address;
	
	@Column(name = "bank")
	private String Bank;
	
	@Column(name = "cardtype")
	private String CardType;
	
	@Column(name = "status")
	private String approvalStatus;

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private List<Order> ord = new ArrayList<Order>();

	public String getUname() {
		return uName;
	}

	public void setUname(String uname) {
		this.uName = uname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String Contact) {
		this.Contact = Contact;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBbankacct() {
		return BankAcct;
	}

	public void setBankacct(String Bankacct) {
		this.BankAcct = Bankacct;
	}

	public String getIfsc() {
		return Ifsc;
	}

	public void setIfsc(String ifsc) {
		this.Ifsc = ifsc;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getCardtype() {
		return CardType;
	}

	public void setCardtype(String cardtype) {
		this.CardType = cardtype;
	}

	public String getApprovalstatus() {
		return approvalStatus;
	}

	public void setApprovalstatus(String approvalstatus) {
		this.approvalStatus = approvalstatus;
	}

	public List<Order> getOrd() {
		return ord;
	}

	public void setOrd(List<Order> ord) {
		this.ord = ord;
	}

	public String getBank() {
		return Bank;
	}

	public void setBank(String bank) {
		this.Bank = bank;
	}

}
