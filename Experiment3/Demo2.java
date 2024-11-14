
class X {
    int i, j;

    
    public X(int i, int j) {
        this.i = i;
        this.j = j;
    }

   
    public int finalSum() {
        return i + j;
    }
}
class Y extends X {
    public Y(int i, int j) {
        super(i, j);  
    }

  
    public int findProduct() {
        return i * j;
    }
}
class Z extends Y {
    public Z(int i, int j) {
        super(i, j);  
    }

   
    public void display() {
        int sum = finalSum();
        int product = findProduct();
        int difference = i - j;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Z obj = new Z(5, 3);  
        obj.display();  
    }
}
