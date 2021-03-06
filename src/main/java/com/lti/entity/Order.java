package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author yashwanth
 *
 * @version 1.8
 */

@Entity
@Table(name = "orders")
@SequenceGenerator(name = "ordseq", sequenceName = "seq_ord", initialValue = 1001, allocationSize = 1)
//@NamedQuery(name = "orderfetch", query = "FROM orders WHERE  uname=:username ")
public class Order {

	@Id
	@Column(name = "Order_id")
	@GeneratedValue(generator = "ordseq", strategy = GenerationType.SEQUENCE)
	private int orderID;

	@Column(name = "Order_date", length = 15)
	private String orderDate;

	@Column(name = "emi_duration")
	private int emiDuration;

	@ManyToOne
	@JoinColumn(name = "uname")
	private User user;

	@ManyToOne
	@JoinColumn(name = "pId")
	private Product product;

	@Column(name = "amountPaid")
	private double amountPaid;

	@Column(name = "dueAmount")
	private double dueAmount;

	@Column(name = "monthsLeft")
	private int monthsLeft;

	@Column(name = "recentDate", length = 15)
	private String recentDate;

	public String getRecentDate() {
		return recentDate;
	}

	public void setRecentDate(String recentDate) {
		this.recentDate = recentDate;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public int getMonthsLeft() {
		return monthsLeft;
	}

	public void setMonthsLeft(int monthsLeft) {
		this.monthsLeft = monthsLeft;
	}

	public int getO_id() {
		return orderID;
	}

	public void setO_id(int o_id) {
		this.orderID = o_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getEmiDuration() {
		return emiDuration;
	}

	public void setEmiDuration(int emiDuration) {
		this.emiDuration = emiDuration;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [id=" + orderID + ", stock=" + orderDate + ", quantity=" + emiDuration + ", quote=" + user
				+ ",product=" + product + "]";
	}
}