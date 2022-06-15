import java.util.Scanner;

public class RectangleStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter width: "); // user input for width
        double width = sc.nextDouble(); //reads user input in terms of double 

        
        System.out.print("Enter length: "); // user input for length
        double length = sc.nextDouble(); //reads user input in terms of double

        
        double area = width * length; // calculation of area

        
        double perimeter = 2 * (width + length); // calculaton of perimeter

        // output message
        System.out.println("When one side is " + width + " and the other side is " + length + ", the area is " + area + " and the perimeter is " + perimeter + ".");
    }
}
