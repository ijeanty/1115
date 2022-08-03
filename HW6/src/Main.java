import java.util.Scanner;

// Main class
public class Main {
	public static void main(String[] args) {

		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);

		try {

			int m, y;

			// get month
			System.out.print("Enter a month: (1-12): ");
			m = sc.nextInt();

			// get year
			System.out.print("Enter a year: ");
			y = sc.nextInt();

			// create and object of MonthDay class
			MonthDays M = new MonthDays(m, y);
			System.out.println(M.getMonthName() + " " + M.year + " has " + M.getNumberOfDays() + " days");

		} catch (InvalidMonthException ex) {
			System.out.println(ex);
		}
		sc.close();
	}
}

// custom InvalidMonthException
class InvalidMonthException extends Exception {
	public InvalidMonthException(String str) {
		super(str);
	}
}

// Month class
class Month {
	public int monthNumber;

	// default constructor
	public Month() {
		monthNumber = 1;
	}

	// paramterized constructor for month number
	public Month(int m) throws InvalidMonthException {
		if (m < 1 || m > 12) {
			monthNumber = 1;

			// throw an exception
			throw new InvalidMonthException("Invalid month passed!");
		} else {
			monthNumber = m;
		}
	}

	// paramterized constructor for month name
	public Month(String m) throws InvalidMonthException {
		String[] months = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };

		// find month number
		int monthIndx = -1;
		for (int i = 0; i < months.length; i++) {
			if (months[i] == m) {
				monthIndx = i;
			}
		}

		if (monthIndx == -1) {
			monthNumber = 1;

			// throw an exception
			throw new InvalidMonthException("Invalid month name passed!");
		} else {
			monthNumber = monthIndx + 1;
		}
	}

	// setMonthNumber function
	public void setMonthNumber(int m) {
		if (m < 1 || m > 12) {
			monthNumber = 1;
		} else {
			monthNumber = m;
		}
	}

	// getMonthNumber function
	public int getMonthNumber() {
		return monthNumber;
	}

	// getMonthName function
	public String getMonthName() {

		// store the month name in monthName variable
		String monthName = "";
		switch (monthNumber) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
		}

		return monthName;
	}

	// toString function
	public String toString() {
		return getMonthName();
	}

	// equals function
	public boolean equals(Month m) {
		if (monthNumber == m.monthNumber) {
			return true;
		}

		return false;
	}
}

// MonthDays class
class MonthDays extends Month {
	public int year;

	// parameterized constructor
	public MonthDays(int m, int y) throws InvalidMonthException {
		super(m);
		year = y;
	}

	// getNumberOfDays function
	public int getNumberOfDays() {

		int[] month_days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// find whether the year is leap year or not
		boolean isLeap = false;

		if (year % 100 == 0 && year % 400 == 0) {
			isLeap = true;
		} else {
			if (year % 4 == 0) {
				isLeap = true;
			}
		}

		// if the monthNumber is 2 and it is a leap year
		if (monthNumber == 2 && isLeap) {
			return 29;
		} else {
			return month_days[monthNumber - 1];
		}

	}
}