package edu.cis232.semesterproject;

import edu.cis232.semesterproject.*;

public class PasswordCheckerClass {
	
	public static boolean checker(String password) throws IllegalPasswordException{
		if(password.equals("semester")){
			return true;
		}
		else{
			throw new IllegalPasswordException(password);
		}
	}
}
