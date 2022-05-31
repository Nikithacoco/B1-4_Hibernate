package com.tns.shopping.entities;

import java.io.Serializable;
public class Customer implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	
	private int id;
	
	private String name;
	
	private OrderDetails order_id;

	private String phone;
	
	private String email;
	public int getId() {
		return id;
	
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public OrderDetails getOrder_id() {
		return order_id;
	}
	public void setOrder_id(OrderDetails order_id) {
		this.order_id = order_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
