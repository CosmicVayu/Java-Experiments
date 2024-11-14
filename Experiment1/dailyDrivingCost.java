/*Q1)Create an application that calculate your daily driving cost , so that you can
estimate how much money could be saved by car pooling which also has other
advantages such as reducing carbon emission and traffic congestion . The application
should input the following informationand display the user's cost per day of driving
to work.

 a)total miles driven per day
 b)cost per gallon of gasoline
 c)average fees per day
 d)tolls per day */

import java.util.Scanner;


public class dailyDrivingCost {

    public static void main(String[] args) {
        
    

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the total miles driven per day:");
    double totalMiles=sc.nextDouble();

    System.out.println("Cost per gallons of gasoline:");
    double costPerGallons=sc.nextDouble();

    System.out.println("Enter average fees per day:");
    double averageFees=sc.nextDouble();

    System.out.println("Enter total payment for tolls:");
    double tollFees=sc.nextDouble();

    System.out.println("Enter miles per gallon:");
    double milesPerGallon=sc.nextDouble();

    double totalGallons=totalMiles/milesPerGallon;
    double costOfGallons=totalGallons*costPerGallons;

    double totalcost=costOfGallons+averageFees+tollFees;

    System.out.printf("Total cost of the day is:%f%n",totalcost);


    }

    
}
