/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

import java.util.Scanner;
/**
* Puts our many classes together to form a scarecrow
@return       printed ASCII art of a scarecrow
* 
*/
class Scarecrow {

    /* Parts of the Scarecrow
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;

    /**
     * Constructor for the scarecrow
     * @param Pumpkin an ASCII pumpkin head
     * @param Shirt an ASCII shirt
     * @param Pants a pair of ASCII pants
     * @param Boot a left boot
     * @param Boot a right boot
     * @return      the ASCII parts together
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot lb, Boot rb, Banner s, String m) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lb;
        rightFoot = rb;
        sign = s;
    }

/** 
 * Display method for the scarecrow, runs the display methods of each class within the scarecrow
 */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /**
     * Main method for the scarecrow
     * @param args command-line arguments
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string!");
        String userString = input.nextLine();
        System.out.println();

        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner(userString), userString);
       
        myScarecrow.display();
        input.close();
    }
}


