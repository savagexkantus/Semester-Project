package edu.cis232.semesterproject;
import java.util.StringTokenizer;
public class PriceTag {
	
	public String tokenizer(String title, String retailPrice, String upc){
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(title);
		
		while (st.hasMoreTokens()){
			 sb.append(st.nextToken().charAt(0));
		}
		
		sb.append(retailPrice);
		sb.append(' ');
		sb.append(upc);
		String tag = sb.toString();
		return tag;
	}

}
