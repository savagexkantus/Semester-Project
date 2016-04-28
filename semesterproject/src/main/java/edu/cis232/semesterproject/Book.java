package edu.cis232.semesterproject;

public class Book {
	// REQ#5
	String title;
	String sku;
	String upc;
	String author;
	String price;
	String retailPrice;
	String genre;
	int quantity;
	
	public Book(String title, String sku, String upc, String author, String price, String retailPrice, String genre, int quantity){
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

	public String getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
