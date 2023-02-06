/* 
Name: Isaac Jeanty
Assignment: Homework #1
Description: The area and perimeter of a rectangle are computed and shown by this software.
Explanation: The code is a Java program that figures out and shows a rectangle's area and perimeter.
The program takes user input for the rectangle's width and height using the Scanner class.
The formula for calculating the area and perimeter are, respectively, area = width * height and perimeter = 2 * (width + height).
The user is then prompted to input a width and height after the application presents the area and perimeter of a 
rectangle with a provided width and height of 4.5 and 7.9, respectively. After computing and displaying the area 
and perimeter for the specified width and height,
The Scanner object is finally closed.
*/

package IsaacJeantyCalcArea;

import java.util.Scanner;

public class IsaacJeantyCalcArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Given width and height
        double width = 4.5;
        double height = 7.9;

        // Calculate area and perimeter using formulas
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Display results for given width and height
        System.out.println("The Area of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + area);
        System.out.println("The Perimeter of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + perimeter);

        // Prompt user for width and height
        System.out.print("Please enter a width: ");
        width = input.nextDouble();
        System.out.print("Please enter a height: ");
        height = input.nextDouble();

        // Display results for user-supplied width and height
        System.out.println("The Area of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + area);
        System.out.println("The Perimeter of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + perimeter);

        input.close();
    }
}