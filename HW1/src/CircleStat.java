import java.util.Scanner;

public class CircleStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc variable = the input of the user

    
        System.out.print("Enter radius: "); // user input for radius
        double radius = sc.nextDouble(); //reads input


        double circumference = 2 * Math.PI * radius; //calculation of the circumference


        double area = Math.PI * radius * radius; //calculation of the area && 'Math.Pi' is a method which is equivalent to 'pi' in mathematics

        // output message
        System.out.println("When the radius is " + radius + ", the circumference is " + circumference + " and the area is " + area + ".");
    }
}
