package ders18AccesModifiers.Other;

import ders18AccesModifier.Book;

public class MainOther {

	public static void main(String[] args) {
		 Book myBook = new Book("1984", "George Orwell", "978-0451524935", "180");
	        myBook.title = "Animal Farm";
	        myBook.author = "George Orwell";
	        myBook.page = "180";
	        System.out.println("Book Title: " + myBook.title);
	        System.out.println("Book Author: " + myBook.author);
	        System.out.println("Book Id: " + myBook.id);
	        System.out.println("Page count: " + myBook.page);
	}

}
