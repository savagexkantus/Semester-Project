package edu.cis232.semesterproject;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("Semester Project");
    	System.out.println("Alex Carroll");
    	System.out.println("Brad Wilfong");
    	// REQ#1
    	
        System.out.println("Inventory system (for books)" );
        ChildrensBook catinthehat = new ChildrensBook("The Cat in the Hat", 5, 200, "Dr. Seuss", 5.47, 9.95, "Children", 3, 7);
        AdultBook catcherintherye = new AdultBook("Catcher in the Rye", 4, 220, "J.D. Salinger", 6.70, 10.99, "Fiction", 1, false);
        System.out.println(catinthehat.getAuthor());
        System.out.println(catinthehat.getTargetAge());
        System.out.println(catcherintherye.getAuthor());
        System.out.println(catcherintherye.SafeForKids());
    }
}
