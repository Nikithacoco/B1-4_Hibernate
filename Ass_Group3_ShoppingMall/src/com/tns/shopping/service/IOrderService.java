package com.tns.shopping.service;

public interface IOrderRepository
{
	public Order addOrder(Order Order );
	public Order updateOrder(Order Order);
	public Order searchOrder(long Order);
	public void deleteOrder(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}