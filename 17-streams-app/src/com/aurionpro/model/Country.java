package com.aurionpro.model;

public class Country {
	private String countryCode;
	private String name;
	private Integer regionId;
	public Country(String countryCode, String name, Integer regionId) {
		super();
		this.countryCode = countryCode;
		this.name = name;
		this.regionId = regionId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
}
