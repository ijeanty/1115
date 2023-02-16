/* 
Name: Isaac Jeanty

Assignment: Homework #2

Description: Implementing a straightforward unit conversion application that takes a user-inputted amount of inches and transforms 
it into yards, feet, and inches is necessary for the first portion of the issue.
To do this, multiply the number of inches by the appropriate conversion factors.
(A yard is 36 inches long and a foot is 12 inches).
A Scanner object may be used in the program to gather user input.

Explanation: To read input from the console, create a Scanner object like follows: Request the user's measurement in inches:
the user's input, read it: Determine how many yards, feet, and inches are left: Print the outcomes:
 */

package isaacjeantycalculations;

import java.util.Scanner;

public class IsaacJeantyCalculations {

    //main method - step #1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scan user input
        System.out.print("Enter the number of inches: ");
        int inches = input.nextInt();
        int yards = inches / 36;
        int remainingInches = inches % 36;
        int feet = remainingInches / 12;
        remainingInches = remainingInches % 12;
        System.out.println(inches + " inches is equal to " + yards //print out to console answer for step #1
                + " yard(s), " + feet + " feet, and "
                + remainingInches + " inch(es).\n");

        costOfItems(); // recalling method 'costOfItems'
    } // end of main

    // step #2 - cost of items method
    static void costOfItems() {
        int pencils = 10; //amount of pencils
        double pencilCost = 0.75; // cost of 1 pencil
        int pens = 5; //amount of pens
        double penCost = 0.50; //cost of 1 pen
        int erasers = 3; //amount of erasers
        double eraserCost = 0.25; //cost of 1 eraser
        int notebooks = 2; //amount of notebooks
        double notebookCost = 1.39; // cost of 1 notebooks

        double individualCostPencils = pencils * pencilCost; 
        double individualCostPens = pens * penCost;
        double individualCostErasers = erasers * eraserCost;
        double individualCostNotebooks = notebooks * notebookCost;
        double totalCost = individualCostPencils + individualCostPens
                + individualCostErasers + individualCostNotebooks;
        double tax = totalCost * 0.0825; //tax cost calculations
        double totalCostWithTax = totalCost + tax;

        System.out.printf("Individual cost of pencils: $%.2f\n", individualCostPencils); 
        System.out.printf("Individual cost of pens: $%.2f\n", individualCostPens);
        System.out.printf("Individual cost of erasers: $%.2f\n", individualCostErasers);
        System.out.printf("Individual cost of notebooks: $%.2f\n", individualCostNotebooks);
        System.out.printf("Total cost of items: $%.2f\n", totalCost);
        System.out.printf("Sales tax: $%.2f\n", tax);
        System.out.printf("Total cost with tax: $%.2f\n", totalCostWithTax);
    }// end of method
}