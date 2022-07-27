// MonthDays class
public class MonthDays extends Month{
    public int year;
    
    // parameterized constructor
    public MonthDays(int m,int y) throws InvalidMonthException{
        super(m);
        year = y;
    }
    
    // getNumberOfDays function
    public int getNumberOfDays(){
        
        int []month_days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        
        // find whether the year is leap year or not
        boolean isLeap = false;
        
        if(year % 100 == 0 && year % 400 == 0){
            isLeap = true;
        }
        else{
            if(year % 4 == 0){
                isLeap = true;
            }
        }
        
        // if the monthNumber is 2 and it is a leap year
        if(monthNumber == 2 && isLeap){
            return 29;
        }
        else{
            return month_days[monthNumber-1];
        }
        
    }
}