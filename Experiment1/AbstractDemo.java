abstract class Shape
{
    abstract void area(int l,int b);

}
class Rectangle extends Shape
{
    void area(int l,int b)
    {
        System.out.println("rectangle area:"+(l*b));
    }
}
class Triangle extends Shape
{
    void area(int l,int b)
    {
        System.out.printf("traingle area",+(l*b)/2);
    }
}


public class AbstractDemo {

    public static void main(String[] args) {
        
    }
    
}
