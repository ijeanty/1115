import java.sql.Time;

public class Array {

    static void basicArray() {
        int[] nums = new int[50]; //declaration of int array with 50 elements
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) + 10; //adding 10 to each entry off array nums
        }
        for (int i : nums) { //store values 1 through 50
            System.out.println(i); //print every element of nums
        }
    }

    static void printElements(String[] input) { //accepts an array of Strings as the input parameter argument.
        try {
            for (String s : input) { 
                System.out.println(s + " " + s.length()); //print elements of the array
            }
        } catch (Exception e) {
            e.printStackTrace(); //verification of each element is a string type
        }
    }

    static void printElements(int[][] input) { //two-dimensional array parameter argument
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) { //for each row in array
                System.out.printf("%2d", input[i][j]); //print elements of the 2D array
            }
            System.out.print("\n"); //new line after every row
        }
    }

    static void printElements(Time[] input) { //accepts an array of Time Objects 
        try {
            for (Time t : input) {
                System.out.println(t); //print elements of the array
            }
        } catch (Exception e) {
            e.printStackTrace(); // verification of each element being a Time type and printing array elements as strings.
        }
    }

    public static void main(String[] args) {
        String[] input1 = {"first", "second", "third", "fourth", "sixth", "seventh", "eighth", "ninth", "tenth"}; //array of 10 strings
        printElements(input1); //invoking method of "input1"

        System.out.println(); //print the array
        System.out.println();

        Time[] t = new Time[3]; //declaration of 3 Time objects
        t[0] = new Time(123456789991L); //storing time in array element
        t[1] = new Time(123456289992L);
        t[2] = new Time(123458789993L);
        printElements(t); 

        System.out.println(); //print the array
        System.out.println();

        int[][] values = new int[10][20]; //declare two-dimensional array with 10 rows & 20 columns
        System.out.println("Rows in 2D array = " + values.length); //prints rows of 2D array + ".length" property to retrieve array size.
        System.out.println("Columns in 2D array = " + values[0].length); //prints columns of 2D array + ".length" property to retrieve array size.
        printElements(values);

    }

}


