/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Prints ASCII art of a shirt and arms
 * @return         an ASCII torso
 */
public class Shirt {

/**
 * Display method for the torso, contains print arguments that construct the torso
 */
    public void display() {
        System.out.println("       ___/       \\___ ");
        System.out.println("     '                  '");
        System.out.println("    '                    '");
        System.out.println("   '                      '");
        System.out.println("  '                        '");
        System.out.println(" '                         '");
        System.out.println(" '                         '");
        System.out.println(" |   '                  '   |");
        System.out.println(" |   '                  '   |");
        System.out.println(" ---  |               |  ---");
        System.out.println("      |               |");
        System.out.println("      |               |");
        System.out.println("      |               |");
        System.out.println("      |               |");
        System.out.println("      |               |");
        System.out.println("      [_______________]");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
