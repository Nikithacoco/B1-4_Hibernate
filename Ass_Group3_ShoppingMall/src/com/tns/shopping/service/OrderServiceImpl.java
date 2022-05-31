package com.tns.shopping.service;

import com.tns.shopping.entities.Order;


public class OrderServiceImpl implements IOrderService
{
	//Establishing connection between Service and Repository
	private IOrderRepository dao;
	
	public OrderServiceImpl()
	{
		dao = new OrderRepositoryImpl();
	}
	
	//Service calls to perform CRUD operation
	@Override
	public Order addNewOrder(Order user) {
		dao.beginTransaction();
		dao.addNewOrder(Order);
		dao.commitTransaction();
		return Order;
	}

	@Override
	public Order updateUser(Order user) {
		dao.beginTransaction();
		dao.updateUser(Order);
		dao.commitTransaction();
		return Order;
	}

	@Override
	public Order login(Order Order) {
		dao.beginTransaction();
		((OrderServiceImpl) dao).login(Order);
		dao.commitTransaction();
		return Order;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		((OrderServiceImpl) dao).logOut();
		dao.commitTransaction();
		return false;
	}

}