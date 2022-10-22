/*
 * Pumpkin class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Returns ASCII art of a jack-o-lantern head
 * @return          printed ASCII art of a pumpkin
 */
public class Pumpkin {
    
    /**
     * Display method for the pumpkin, contains print arguments to construct a jack-o'-lantern to the console
     */
    public void display() {

        System.out.println("              ___");
        System.out.println("           ___)__|_");
        System.out.println("      .-*'          '*-,");
        System.out.println("     /      /|   |\\     \\ ");
        System.out.println("    ;      /_|   |_\\     ;");
        System.out.println("    ;   |\\           /|  ;");
        System.out.println("    ;   | ''--...--'' |  ;");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("     ''*-.,_______,.-*'  ");  

    }
    
    /**
     * Main method for the pumpkin
     * @param args command-line arguments
    */
    public static void main(String[] args) {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }

}
