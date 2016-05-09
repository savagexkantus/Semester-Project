package edu.cis232.semesterproject;
import java.util.StringTokenizer;
public class PriceTag {
	// #REQ 2
	public String tokenizer(String title, String retailPrice){
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(title);
		
		while (st.hasMoreTokens()){
			 sb.append(st.nextToken().charAt(0));
		}
		
		sb.append(' ');
		sb.append(retailPrice);
		String tag = sb.toString();
		return tag;
	}

}
