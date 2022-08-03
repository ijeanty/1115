package NeighborhoodSales;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class NeighborhoodSales {


  public static int readData(String[] name, double[] avgSales) throws Exception {

    //replace the name of the file with your input file name
    //open input file

    Scanner reader = new Scanner(new File("input.txt"));

    int count = 0; // initialize number of records to 0

    //loop over the file, reading the records into the file

    while (reader.hasNext()) {
      name[count] = reader.next(); // read the name of neighborhood
      //read the 4 sales and compute its average and insert it into the avgSales
      avgSales[count] = (reader.nextDouble() + reader.nextDouble() + reader.nextDouble() + reader.nextDouble()) / 4;
      count++;
    }
    reader.close(); //close the file
    return count;
  }

  public static void modifyData(double[] avgSales, int nRecords) {
    double avg = 0;
    for (int i = 0; i < nRecords; i++) { //loop to compute total of all average sales
      avg += avgSales[i];
    }

    avg = avg / nRecords; //compute the average of average sales

    //loop over the array to modify the sales
    for (int i = 0; i < nRecords; i++) {

      if (avgSales[i] < avg) //ith avgSales < avg, increment its sales by 10%
        avgSales[i] += 0.1 * avgSales[i];
      else if (avgSales[i] > avg) //ith avgSales > avg, decrement its sales by 15%
        avgSales[i] -= 0.15 * avgSales[i];
    }
  }

  public static void sortArrays(String[] name, double[] avgSales, int nRecords) {

    //loop over the array from start to second last index
    for (int i = 0; i < nRecords - 1; i++) {

      //loop to compare the sales for adjacent records and swap when out of order
      for (int j = 0; j < nRecords - 1 - i; j++) {

        if (avgSales[j] < avgSales[j + 1]) { //sales for jth record < sales for (j+1)th record

          //swap the name and sales
          String tempName = name[j];

          name[j] = name[j + 1];

          name[j + 1] = tempName;

          double tempSales = avgSales[j];

          avgSales[j] = avgSales[j + 1];

          avgSales[j + 1] = tempSales;

        }
      }
    }
  }

  public static void main(String[] args) throws Exception {

    // create an array of size 100 for name and avgSales
    String[] name = new String[100];

    double[] avgSales = new double[100];

    // read the data from file into the arrays
    int nRecords = readData(name, avgSales);

    // modify the sales based on total average of all average sales
    modifyData(avgSales, nRecords);

    // sort the arrays in descending order of average sales
    sortArrays(name, avgSales, nRecords);

    // create and open output file
    PrintStream writer = new PrintStream("output.txt");

    // output the table header
    writer.printf("%-30s%15s", "Neighborhood", "Avg Price");

    // loop to output the three neighborhoods that have the highest average prices,
    // in descending order
    for (int i = 0; i < 3; i++)
      writer.printf("\n%-30s%13.2f", name[i], avgSales[i]);

    // output the table header
    writer.printf("\n%-30s%15s", "Neighborhood", "Avg Price");

    // loop to output the three neighborhoods that have the lowest average prices in
    // ascending order
    for (int i = nRecords - 1; i > nRecords - 4; i--)

      writer.printf("\n%-30s%13.2f", name[i], avgSales[i]);

    writer.close(); // close the output file

  }

}