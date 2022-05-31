package com.tns.shopping.entities;

import java.io.Serializable;
public class Order implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id

	private int id;
	
	private  String  dateofPurchase;

	private float total;
	
	private Customer Customer_id;
	
	private String paymentMode;
	private Shop Shop_id
	public int getShopId() {
		return id;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateofpurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(String dateofpurchase) {
		this.dateofPurchase =dateofpurchase;
	}
	public float gettotal() {
		return total;
	}
	public void setCustomer_id(Customer Customer_id) {
		this.Customer_id = Customer_id;
	}
	public String getpaymentMode() {
		return paymentMode;
	}
	
	public void setShop_id(Shop Shop_id) {
		this.Shop_id =Shop;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", dateofPurchase=" + dateofPurchase + ", total=" + total + ", paymentMode=" +  paymentMode + "]";
	}
	
}
