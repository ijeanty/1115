package program1;

import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;



public class Program1 {

    // Factorial method
    public static int factorial(int number) {
        int fact = 1;
        for (int x = 2; x <= number; x++) fact = fact * x;
        return fact;
    }

    // Sum of Squares Method
    public static int sumOfSquares(int number) {
        int sum = 0;
        for (int x = 1; x <= number; x++) sum += (int) x * x;
        return sum;
    }

    // Fibonacci Sequence Method
    public static int fibonacci(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args) throws Exception {
        
        try {
            PrintStream ps;
            try (Scanner inputFile = new Scanner(new File("input.txt")) // the input file to read from
            ) {
                ps = new PrintStream(new File("output.txt")); // the name of the output file generated
                
                int number;
                int result;
                
                while ( inputFile.hasNextInt()){
                    number = inputFile.nextInt();
                    
                    result = factorial(number);
                    ps.printf("Factorial of "+number+" is "+ result+"\r\n");
                    
                    result = sumOfSquares(number);
                    ps.printf("Series sum of "+number+" is "+ result+"\r\n");
                    
                    int fibb = fibonacci(number);
                    ps.printf("Fibonacci series for first "+ number+" terms:\r\n");
                    for (int term = 1; term <= number; term++) fibb = fibonacci(term); ps.print(fibb+" \n");
                    
                    ps.printf("\r\n");
                    ps.flush();
                }
            }
            ps.close();


        } catch (FileNotFoundException e) {
            System.out.println("Error: could not find the input file to read.");
        }


    }
}
