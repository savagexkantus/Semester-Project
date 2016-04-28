package edu.cis232.semesterproject;

public class ChildrensBook extends Book{
	//REQ#6

	public int targetAge;
	public ChildrensBook(String title, int sku, int upc, String author, double price, double retailPrice, String genre, int quantity, int targetAge) {
		super(title, sku, upc, author, price, retailPrice, genre, quantity);
		this.targetAge = targetAge;
		
	}
	public int getTargetAge() {
		return targetAge;
	}
	public void setTargetAge(int targetAge) {
		this.targetAge = targetAge;
	}

}
