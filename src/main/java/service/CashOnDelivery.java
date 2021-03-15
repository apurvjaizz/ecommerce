package service;

public class CashOnDelivery implements Payment
{
	public CashOnDelivery() {}
	public boolean pay(double amount) 
	{
		System.out.println("Payment is processing...");
		return false;
	}
}
