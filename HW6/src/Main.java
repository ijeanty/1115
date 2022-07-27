import java.util.Scanner;

// Main class
public class Main
{
	public static void main(String[] args) {
	    
	    // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);
	    
		try{
		    
		    int m,y;
		    
		    // get month
		    System.out.print("Enter a month: (1-12): ");
		    m = sc.nextInt();
		    
		    // get year
		    System.out.print("Enter a year: ");
		    y = sc.nextInt();
		    
		    // create and object of MonthDay class
		    MonthDays M = new MonthDays(m,y);
		    System.out.println(M.getMonthName()+" "+M.year+" has "+M.getNumberOfDays()+" days");
		    
		}
		catch (InvalidMonthException ex){
		    System.out.println(ex);
		}
	}
}
