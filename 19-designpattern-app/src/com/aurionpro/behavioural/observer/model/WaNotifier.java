package com.aurionpro.behavioural.observer.model;

public class WaNotifier implements INotifier {

	@Override
	public void giveNotification(Account account,String message) {
		// TODO Auto-generated method stub
		System.out.println("WA notifiaction");
		System.out.println(account.getName()+", Transaction performed on your account "+account.getAccountNumber()+" "+message);

	}

}
