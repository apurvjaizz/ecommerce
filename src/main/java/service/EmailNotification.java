package service;

import entities.Order;

public class EmailNotification implements Notification
{

	public void notification(Order order) 
	{
		String recepient_email=order.getUser().getEmail();
		String email_subject="";
		String email_body="";
		emailNotify(recepient_email,email_subject,email_body);		
		
	}

	private void emailNotify(String recepient_email, String email_subject, String email_body)
	{
		System.out.println("Email Confirmation sent to "+recepient_email);
	}

}
