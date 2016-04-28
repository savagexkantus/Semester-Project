package edu.cis232.semesterproject;

public class Book {
	// REQ#5
	String title;
	int sku;
	int upc;
	String author;
	double price;
	double retailPrice;
	String genre;
	int quantity;
	
	public Book(String title, int sku, int upc, String author, double price, double retailPrice, String genre, int quantity){
		this.title = title;
		this.sku = sku;
		this.upc = upc;
		this.author = author;
		this.price = price;
		this.retailPrice = retailPrice;
		this.genre = genre;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
}
