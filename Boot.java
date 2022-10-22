/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

/**
 * Prints ASCII art of a boot, the direction it is facing depends on which one is called (left or right). If a specification other than left or right is made, the system will ask "Which boot?"
 * @return          printed ASCII art of a boot
 *  */ 
public class Boot {
  
    private String direction;
  
    /**
     * Constructor for the boot
     * @param direction the direction of the boot (right or left) 
     * */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

  /** 
   * Display method for the boot, contains print arguments that construct the boot
   */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("      [_____]");
        } else if (this.direction.equals("right")) {
          System.out.print("   [_____]");
        } else {
          System.out.println("Which boot?");
        }
    }

    
  
  /** 
   * Main method for the boot
   * @param args command-line arguments
   */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
