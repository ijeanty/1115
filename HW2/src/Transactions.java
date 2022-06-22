import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Transactions {

    public static void main(String[] args) throws Exception {

        //create Printstream object, scan file, and heading
        Scanner scanner = new Scanner(new File ("input.txt")); //scan file
        PrintStream ps = new PrintStream("output.txt"); //output to file
        ps.printf("Report from 01-09 to 01-10\n"); //Header of output
        
        //declare variables
        String date;
        int sku = 0;
        double price;
        double discount;
        String line = scanner.nextLine();
        double sum = 0;
        double total;
        double tax = 0;
        double maximum = 0;
        double minimum = 0;
        int count = 0;
        
        //read data from file
        while (scanner.hasNext()) {
            
            //delimeter to remove commas and potential whitespaces
            scanner.useDelimiter(",|\\n"); 
           
            //scan input.txt file
            date = scanner.next();           
            sku = scanner.nextInt();   
            price = scanner.nextDouble();
            discount = Double.parseDouble(scanner.next());
            

            //compute total sum of items' price in file & compute tax
            total = price - (price * (discount / 100));
            tax = sum * 0.08875;
            sum += total;
            
            /* compute maximum/minimum prices / sku
            
                HELP ON THIS PART!
            
          */
            
        }//end while
        
            //display output text
            ps.printf("The total is $%.2f\n", sum);
            ps.printf("The tax is $%.2f\n", tax);
            ps.printf("The highest price item at #%d is at $%.2f\n", sku, maximum);
            ps.printf("The lowest price item at #%d is at $%.2f\n", sku, minimum);
               
            //display completion message
            System.out.println("Report completed.");
        
        //close files
        scanner.close();
        ps.close();
    }
}



