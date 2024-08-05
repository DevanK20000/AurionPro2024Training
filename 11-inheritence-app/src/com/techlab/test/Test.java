package com.techlab.test;

import com.techlab.model.Base;
import com.techlab.model.Derived1;
import com.techlab.model.Derived2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		
		base.display();
		
		base = new Derived1();
		base.display();
		base = new Derived2();
		base.display();
				

	}

}
