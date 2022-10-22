/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Prints a banner that contains a message
 * @return           an ASCII banner with a message inside of it
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /**
     * Constructor for the banner
     * */
    public Banner(String m) {
        this.message = m;
    }

    /**
     * Display method for the banner, contains print arguments to construct the banner with the message inside
     */
    public void display() {
        System.out.println("********************");
        System.out.println("**** " + this.message + " ****");
        System.out.println("********************");
    }

    /**
     * Main method for the banner
     * @param args command-line arguments
    */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
