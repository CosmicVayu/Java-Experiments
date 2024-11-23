class Book {
    int bookID;
    String title;
    String author;
    double price;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

class Periodical extends Book {
    String period;

    Periodical(int bookID, String title, String author, double price, String period) {
        super(bookID, title, author, price);
        this.period = period;
    }

    void modifyPrice(double newPrice) {
        this.price = newPrice;
    }

    void modifyPeriod(String newPeriod) {
        this.period = newPeriod;
    }

    void displayPeriodicalDetails() {
        displayBookDetails();
        System.out.println("Period: " + period);
    }
}

public class Study{
    public static void main(String[] args) {
        Periodical periodical = new Periodical(1, "AIDS weekly", "Vipul", 10.0, "Weekly");
        periodical.displayPeriodicalDetails();
        
        periodical.modifyPrice(12.0);
        periodical.modifyPeriod("Monthly");
        
        System.out.println("Updated Periodical Details:");
        periodical.displayPeriodicalDetails();
    }
}
