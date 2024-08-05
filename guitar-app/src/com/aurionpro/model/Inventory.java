package com.aurionpro.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
		guitars.add(new Guitar(serialNumber, price, spec));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (serialNumber.equals(guitar.getSerialNumber())) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec searchGuitarSpec) {
		List<Guitar> matchGuitars = new LinkedList<>();
		for (Guitar guitar : guitars) {

			GuitarSpec guitarSpec = guitar.getSpec();

			if (guitarSpec.matches(searchGuitarSpec)) {
				matchGuitars.add(guitar);
			}
		}
		return matchGuitars;

	}
}