package edu.cis232.semesterproject;

public class AdultBook extends Book{
	//REQ#6
	boolean explicit;
	public AdultBook(String title, int sku, int upc, String author, double price, double retailPrice, String genre, int quantity, boolean explicit){
		super(title, sku, upc, author, price, retailPrice, genre, quantity);
		this.explicit = explicit;
	}
	public String SafeForKids(){
		if(explicit){
			return "Not safe for kids";
		}
		else{
			return "Fine for kids";
		}
	}

}
