

public class MovieTheater {
    public static double calculateTotalProfit(int attendees) {
        double income = attendees * 5;
        double cost = 20 + (attendees * 0.50);
        return income - cost;
    }

    public static void main(String[] args) {
        int attendees = 100; 
        double totalProfit = calculateTotalProfit(attendees);
        System.out.println("Total Profit: Rs" + totalProfit);
    }
}
