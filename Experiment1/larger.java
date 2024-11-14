import java.util.Scanner;


public class larger {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);

        System.out.println("Enter a and b:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(a>b)
        {
            System.out.println("Larger number is:"+a);
        }
        else if(a==b)
        {
            System.out.println("Both are equal");
        }
        else 
        {
            System.out.println("Larger number is:"+b);
        }
        

    }
    
}
