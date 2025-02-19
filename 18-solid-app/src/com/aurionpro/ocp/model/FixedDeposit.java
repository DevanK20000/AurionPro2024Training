package com.aurionpro.ocp.model;

public class FixedDeposit {
	private Integer accountNumber;
	private String name;
	private Double principal;
	private Integer duration;
	private IFestivalType festival;
	public FixedDeposit(Integer accountNumber, String name, Double principal,Integer duration, IFestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrincipal() {
		return principal;
	}
	public void setPrincipal(Double principal) {
		this.principal = principal;
	}
	public IFestivalType getFestival() {
		return festival;
	}
	public void setFestival(IFestivalType festival) {
		this.festival = festival;
	}
	
	
	public Double calculateSimpleIntreastRate() {
		return (principal*duration*festival.getInterestRate())/100;
		
	}
	
}
