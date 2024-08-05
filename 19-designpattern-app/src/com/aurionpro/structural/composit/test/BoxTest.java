package com.aurionpro.structural.composit.test;

import com.aurionpro.structural.composit.model.Book;
import com.aurionpro.structural.composit.model.CompositBox;
import com.aurionpro.structural.composit.model.Product;
import com.aurionpro.structural.composit.model.VideoGames;

public class BoxTest {
	public static void main(String[] args) {
		Product videoGame1 = new VideoGames("COD", 70.0);
		Product book1 = new Book("GOT", 100.0);
		
		CompositBox compositeBox1 = new CompositBox(videoGame1,book1);
		Product book2 = new Book("HP", 60.0);
		CompositBox compositeBox2 = new CompositBox(book2,compositeBox1);
		
		System.out.println("Total price"+compositeBox2.calculatePrice());
		System.out.println("items inside:");
		compositeBox2.display();
		
	}
}
