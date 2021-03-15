package entities;

import java.util.Date;

public class Order 
{
	long orderId;
	double price;
	User user;
	Date date;
	Cart cart;
	boolean paid;
	OrderStatus status;
	public Order()
	{
		date=new Date();
		orderId=date.getTime();
		status=OrderStatus.PENDING;
	}
	Order(User user,double price,Cart cart)
	{
		this.user=user;
		this.price=price;
		this.cart=cart;
		date=new Date();
		orderId=date.getTime();
		status=OrderStatus.CONFIRMED;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
