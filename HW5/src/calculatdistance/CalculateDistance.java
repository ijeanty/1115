package calculatdistance;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CalculateDistance {

    static String output = ""; //used to output the data

    //method to calculate distance
    static int distance(int speed, int time) {
        int dist = speed * time;
        return dist;
    }


    //method to write data into file
    static void saveAsFile(String fname) {
        try {  
            String file_name = fname + ".txt";
            FileWriter fw = new FileWriter(file_name);
            fw.write(output);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //main method
    public static void main(String[] args) {
        try {

            File myobj = new File("vehicle_info.txt"); //represent file
            Scanner fr = new Scanner(myobj); //read/scan file

            while (fr.hasNextLine()) {
                String line = fr.nextLine(); //store each line in "vehicle_info.txt"
                String[] words = line.split(","); //array deliminiter
                int speed = Integer.parseInt(words[1]); //store spped values
                int time = Integer.parseInt(words[2]); //store time values
                String fname = words[0]; //store file name from words array

                if (speed >= 0 && time > 0) { 
                    output += "Hour \t Distance Traveled \n-------------------------\n"; //header and time coluumns
                    for (int h = 1; h <= time; h++) { //loop through time values
                        int dist = distance(speed, h); //calculates distance
                        output += h + " \t " + dist + "\n"; //display on screen
                    }

                    saveAsFile(fname); //save to file
                    System.out.println(output);
                    output = "";
                }
            }
            fr.close(); //close file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
