package edu.cis232.semesterproject;

public class IllegalPasswordException extends Exception
{
	String password = "";
	public IllegalPasswordException(String password)
	{
		super (String.format("%s is not the password" , password));
	}
}
    
