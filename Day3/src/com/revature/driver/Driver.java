package com.revature.driver;

import com.revature.beans.Book;
import com.revature.beans.Car;

public class Driver {

	public static void main(String[] args) {
		
		Book b = new Book();
		Car c = new Car();
		
		b.setId(100);
		b.setAuthor("Andrew Hoffman");
		b.setTitle("Java");
		
		System.out.println(b);
		
		c.setMake("Hyundai");
		c.setModel("Sonata");
		c.setYear(2007);
		
		System.out.println(c);
		
		
	}
}
