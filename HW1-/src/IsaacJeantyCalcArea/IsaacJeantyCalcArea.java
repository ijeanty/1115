/* 
Name: Isaac Jeanty
Assignment: Homework #1
Description: The area and perimeter of a rectangle are computed and shown by this code.
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
        Scanner scanner = new Scanner(System.in);

        // width and height given from instructions
        double width = 4.5;
        double height = 7.9;
        double widthUser;
        double heightUser;

        // Area & Perimeter calculations
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Results in console for given width and height according to instructions
        System.out.println("The Area of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + area);
        System.out.println("The Perimeter of a rectangle with a width of " + width + " and a height of " + height + 
        " is: " + perimeter);

        // Prompt user for width and height
        System.out.print("Please enter a width: ");
        widthUser = scanner.nextDouble();
        System.out.print("Please enter a height: ");
        heightUser = scanner.nextDouble();

        // User calculations
        double areaUser = widthUser * heightUser;
        double perimeterUser = 2 * (widthUser + heightUser);

        // Results for prompted user of width and height
        System.out.println("The Area of a rectangle with a width of " + widthUser + " and a height of " + heightUser + 
        " is: " + areaUser);
        System.out.println("The Perimeter of a rectangle with a width of " + width + " and a height of " + heightUser + 
        " is: " + perimeterUser);

        scanner.close();
    }
}