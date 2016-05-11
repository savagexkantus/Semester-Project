package edu.cis232.semesterproject;

public class IllegalPasswordException extends Exception
{//REQ 5
	String password = "";
	public IllegalPasswordException(String password)
	{
		super (String.format("%s is not the password" , password));
	}
}
    
