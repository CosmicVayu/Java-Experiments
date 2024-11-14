public class InterestCalculator {
    public static double calculateBalance(double principal, double annualRate, int months) {
        double years = months / 12.0;
        double totalInterest = principal * annualRate * years;
        return principal + totalInterest;
    }

    public static void main(String[] args) {
        double principal = 1000; 
        double annualRate = 0.05; 
        int months = 24; 

        double balance = calculateBalance(principal, annualRate, months);
        System.out.println("Balance after " + months + " months: $" + balance);
    }
}
