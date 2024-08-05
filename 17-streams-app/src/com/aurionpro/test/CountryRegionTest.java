package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class CountryRegionTest {
	public static void main(String[] args) {	
		List<Region> regions = loadRegion();
		List<Country> countries = loadCountries();
		Scanner scanner = new Scanner(System.in);
		
//		//get name of country from country code
//		System.out.print("Enter the country code: ");
//		String countryCode = scanner.nextLine().toUpperCase();
//		
//		List<String> countryCodeFilter = countries.stream()
//												   .filter(country->country.getCountryCode().equals(countryCode))
//												   .map(Country::getName)
//												   .collect(Collectors.toList());
//		
//		System.out.println("Country name with country code "+countryCode+": "+countryCodeFilter.get(0));
//		
//		//get all countries in a region by region id
//		System.out.print("Enter the region id: ");
//		Integer regionId = scanner.nextInt();
//		
//		List<String> countryRegionId = countries.stream().filter(country->country.getRegionId().equals(regionId))
//						  .map(Country::getName)
//						  .collect(Collectors.toList());
//		System.out.println("Country with region id "+regionId+": "+countryRegionId);
//		
		//find count of countries in each region
		Map<Object, Long> regionCount = countries.stream()
												  .map(Country::getRegionId)
												  .collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		System.out.println(regionCount);
	}

	private static List<Country> loadCountries() {
		List<Country> countries = Arrays.asList(
				new Country("IT","Italy",1),
				new Country("JP", "Japan", 3),
				new Country("US", "United States of America", 2),
				new Country("CA", "Canada", 2),
				new Country("CN", "China", 3),
				new Country("IN", "India", 3),
				new Country("AU", "Australia", 3),
				new Country("ZW", "Zimbabwe",4),
				new Country("SG", "Singapore", 3),
				new Country("UK", "United Kingdom", 1),
				new Country("FR", "France", 1),
				new Country("DE", "Germany", 1),
				new Country("ZM", "Zambia", 4),
				new Country("EG", "Egypt", 4),
				new Country("BR", "Brazil", 2),
				new Country("CH", "Switzerland", 1),
				new Country("NL", "Netherlands", 1),
				new Country("MX", "Mexico", 2),
				new Country("KW", "Kuwait", 4),
				new Country("IL", "Israel", 4),
				new Country("DK", "Denmark", 1),
				new Country("HK", "HongKong", 3),
				new Country("NG", "Nigeria", 4),
				new Country("AR", "Argentina", 2),
				new Country("BE", "Belgium", 1));
		return countries;
	}

	private static List<Region> loadRegion() {
		List<Region> regions = Arrays.asList(
				new Region(1, "Europe"),
				new Region(2,"Americas"),
				new Region(3,"Asia"),
				new Region(4,"Middle East and Africa"));
		return regions;
	}
}
