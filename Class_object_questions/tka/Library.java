package com.tka;

public class Library {

	int libraryId;
	String libraryName;
	String bookName;
	String authorName;
	String publisher;
	String bookCategory;
	double bookPrice;
	int totalBooks;
	int availableBooks;
	String memberName;
	boolean isAvailable;

	public static void openLibrary() {
		System.out.println("Library is open");
	}

	public static void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void returnBook() {
		System.out.println("Book returned successfully");
	}

	public static void searchBook() {
		System.out.println("Searching for a book");
	}
	
	public static void closeLibrary() {
		System.out.println("Library is closed");
	}

	public void display() {
		
		System.out.println("Library ID: " + libraryId);
		System.out.println("Library Name: " + libraryName);
		System.out.println("Book Name: " + bookName);
		System.out.println("Author Name: " + authorName);
		System.out.println("Publisher: " + publisher);
		System.out.println("Category: " + bookCategory);
		System.out.println("Book Price: " + bookPrice);
		System.out.println("Total Books: " + totalBooks);
		System.out.println("Available Books: " + availableBooks);
		System.out.println("Member Name: " + memberName);
	
		System.out.println("Is Available: " + isAvailable);

		openLibrary();
		issueBook();
		searchBook();
		returnBook();
		closeLibrary();
	}
}
