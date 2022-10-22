/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Prints ASCII art of a pair of pants
 * @return       printed ASCII art of pants
 */
public class Pants {

/** 
 * Display method for the pants, contains print arguments to construct pants
 */
    public void display() {  
    System.out.println("      |       |       |");
    System.out.println("      |      / \\      |");
    System.out.println("      |     |   |     |");
    System.out.println("      |     |   |     |");
    System.out.println("      |     |   |     |");
    System.out.println("      [_____]   [_____]");
    }

    /**
     * Main method for the pants
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
