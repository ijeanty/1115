import java util.Scanner;

  public class GradeCalculator {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in); //sc variable = the input of the user
      
      System.out.print("Enter Homework score: "); //user input for Homework grade
      double homework = sc.nextDouble(); //reads the user input in whatever score it receives
      
      System.out.print("Enter CodeLab score: "); //user input for CodeLab grade
      double codelab = sc.nextDouble(); //reads the user input in whatever score it receives
      
      System.out.print("Enter MidTerm 1 score: "); //user input for MidTerm 1 grade
      double midtermOne = sc.nextDouble(); //reads the user input in whatever score it receives
      
      System.out.print("Enter MidTerm 2 score: "); //user input for MidTerm 2 grade
      double midtermTwo = sc.nextDouble(); //reads the user input in whatever score it receives
      
      System.out.print("Enter FINAL score: "); //user input for Final exam grade
      double finalExam = sc.nextDouble(); //reads the user input in whatever score it receives
      
      //calculation of inputs
      double overall = homework + codelab + midtermOne + midtermTwo + finalExam
        
      //output calculation
        System.out.println("The total score is " + overall);
    }
  }
