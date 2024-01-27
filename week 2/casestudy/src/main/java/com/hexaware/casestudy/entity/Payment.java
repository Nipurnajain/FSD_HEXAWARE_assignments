package com.hexaware.casestudy.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {

	@Id
	@Column(name = "PaymentID")
	private int paymentId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID")
	private Customers customer;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CartID")
	private Cart cart;

	@Column(name = "PaymentDate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp paymentDate;

	@Column(name = "Amount")
	private BigDecimal amount;

	@Column(name = "PaymentMethod")
	private String paymentMethod;

	@Column(name = "TransactionID")
	private String transactionID;

	public Payment() {
		super();
	}

	public Payment(int paymentId, Customers customer, Cart cart, Timestamp paymentDate, BigDecimal amount,
			String paymentMethod, String transactionID) {
		super();
		this.paymentId = paymentId;
		this.customer = customer;
		this.cart = cart;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionID = transactionID;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Timestamp getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", customer=" + customer + ", cart=" + cart + ", paymentDate="
				+ paymentDate + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", transactionID="
				+ transactionID + "]";
	}

}