package edu.cis232.semesterproject;

public class App 
{
    public static void bookHolder()
    {
    	
        System.out.println("Inventory system (for books)" );
        ChildrensBook gatordad = new ChildrensBook("Gator Dad", "5", "200", "Brian Lies", "5.47", "5.99", "Children", 3, 6);
        ChildrensBook redfoxes = new ChildrensBook("Red Foxes", "7", "270", "Megan Borgert", ".75", "1.99", "Children", 2, 8);
        
        AdultBook thelastmile = new AdultBook("The Last Mile", "4", "220", "David Baldacci", "6.70", "17.50", "Fiction", 1, false);
        AdultBook falloflight = new AdultBook("Fall of Light", "3", "221", "Steven Erikson", "14.00", "19.99", "Fiction", 5, true);
        AdultBook wildelake = new AdultBook("Wilde Lake", "2", "241", "Laura Lippman", "15.60", "22.99", "Non Fiction", 2, false);
        AdultBook cityoflostsouls = new AdultBook("City of Lost Souls", "1", "111", "Cassandra Claire", "15.20", "20.99", "Fiction", 3, true);
       
    }
}
