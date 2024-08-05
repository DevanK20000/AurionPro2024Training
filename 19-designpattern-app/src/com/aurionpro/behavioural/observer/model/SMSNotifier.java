package com.aurionpro.behavioural.observer.model;

public class SMSNotifier implements INotifier {

	@Override
	public void giveNotification(Account account,String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS notifiaction");
		System.out.println(account.getName()+", Transaction performed on your account "+account.getAccountNumber()+" "+message);
	}

}
