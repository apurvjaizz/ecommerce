package service;

import java.util.HashMap;

import entities.Cart;
import entities.Item;
import entities.Order;
import entities.User;

public class CheckOutService 
{
	public void checkOut(User user, Cart cart)
	{
		//calculating amount
		double amount=getTotalCartValue(cart);
		
		//placing order
		Order order=placeOrder(user,cart,amount);
		
		//notifying
		notify(order);
	}
	private void notify(Order order) 
	{
		EmailNotification notification=new EmailNotification();
		notification.notification(order);
	}
	public double getTotalCartValue(Cart cart)
	{
		double amount=0;
		HashMap<Item,Integer> cartItems=new HashMap<Item,Integer>(cart.getCart());
		for(Item i:cartItems.keySet())
		{
			amount+=i.getPrice()*cartItems.get(i);
		}
		return amount;
	}
	public Order placeOrder(User user, Cart cart,double amount)
	{
		Order order=new Order();
		CashOnDelivery payment=new CashOnDelivery();
		order.setPaid(payment.pay(amount));
		order.setPrice(amount);
		order.setUser(user);
		order.setCart(cart);
		System.out.println("Order Successful");
		System.out.println("Order Id: "+order.getOrderId());
		System.out.println("Order Details: ");order.getCart().viewCart(cart);	
		System.out.println("Order Amount: "+order.getPrice());
		System.out.println("Shipping Address: "+order.getUser().getAddress());
		return order;
	}
}
