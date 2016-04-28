package edu.cis232.semesterproject;

public class ChildrensBook extends Book implements Genre{
	//REQ#6 and REQ #4

	public int targetAge;
	public ChildrensBook(String title, String sku, String upc, String author, String price, String retailPrice, String genre, int quantity, int targetAge) {
		super(title, sku, upc, author, price, retailPrice, genre, quantity);
		this.targetAge = targetAge;
		
	}
	public int getTargetAge() {
		return targetAge;
	}
	public void setTargetAge(int targetAge) {
		this.targetAge = targetAge;
	}
	public String getGenre() {
		return "Children (" + targetAge + ")";
	}
	public void setGenre(String a) {
		genre = "Children";
	}

}
