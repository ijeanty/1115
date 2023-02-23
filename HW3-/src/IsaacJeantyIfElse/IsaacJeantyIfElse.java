/* 
Name: Isaac Jeanty

Assignment: Homework #3

Description: A Java Program that reads 3 angles for a triangle and computes if it is a vaild triangle.

Explanation: To hold the three angles of the triangle, three integer variables angle1, angle2, and angle3 are defined.
The user is asked to input three angles, which are read using the Scanner class's nextInt() function.
The program tests to see if all of the angles are legitimate, i.e. larger than 0. 
If any of the angles is 0 or less, an error message is produced, 
and the application terminates using the System.exit() function.
If it is vaild, then it will display a message that it 'is' valid. Likewise, if someone were to put
a # summed up to 'more than 180' than an error message would pop up also.
The program resullts may cary upon each runtime.
 */

package IsaacJeantyIfElse;

import java.util.Scanner;

public class IsaacJeantyIfElse {

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scans user input

        int angle1;
        int angle2;
        int angle3;

        // Prompt the user to enter the 3 angles
        System.out.println("Please enter 3 angles:");
        angle1 = input.nextInt();
        angle2 = input.nextInt();
        angle3 = input.nextInt();

        // Check if all the angles are valid
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            // Display an error message and exit the program
            System.out.println("Input is invalid • try again!");
            System.exit(0);
        }

        // Check if the angles create a valid triangle
        if (angle1 + angle2 + angle3 == 180) {
            // Display a message that the angles create a valid triangle
            System.out.println("This is a valid triangle");
        } else {
            // Display a message that the angles do not create a valid triangle
            System.out.println("This is NOT a valid triangle. The angles do NOT sum up to '180°'");
        }

    }// end main
}// end class