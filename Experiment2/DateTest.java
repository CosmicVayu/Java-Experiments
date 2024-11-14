class Date {
    private int month;
    private int day;
    private int year;

    
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

   
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

   
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    
    public void displayDate() {
        System.out.printf("%02d/%02d/%d\n", month, day, year);
    }
}

public class DateTest {
    public static void main(String[] args) {
       
        Date date1 = new Date(11, 11, 2024);
        
        
        System.out.print("The date is: ");
        date1.displayDate();
        
       
        date1.setMonth(5);
        date1.setDay(15);
        date1.setYear(2023);
        
        System.out.print("The updated date is: ");
        date1.displayDate();
    }
}
