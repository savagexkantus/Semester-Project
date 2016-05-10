package edu.cis232.semesterproject;

public class AdultBook extends Book implements Genre{
	//REQ#6 and REQ #4
	
	boolean explicit;
	public AdultBook(String title, String sku, String upc, String author, String price, String retailPrice, String genre, int quantity, boolean explicit){
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
	public String getGenre() {
		return "Adult";
	}
	public void setGenre(String a) {
		genre = a;
		
	}

}
