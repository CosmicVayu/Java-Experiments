// Define a class called fruit with the following attributes :
// 1. Name of the fruit. 2. Single fruit or bunch fruit. 3. Price.
// Define a suitable constructor and displayFruit() method that displays values of all
// the attributes. Write a program that creates 2 objects of fruit class and display their
// attributes.

class Fruit {
    String Name;
    String type;
    float price;

    public Fruit(String name, String type, float price) {
        this.Name = name;
        this.type = type;
        this.price = price;
    }

    public void displayFruit() {
        System.out.println("Fruit Name : " + Name);
        System.out.println("Fruit Type : " + type);
        System.out.println("Fruit Price : " + price);
    }
}

public class FruitDemo {

    public static void main(String[] args) {

        Fruit f1 = new Fruit("Apple", "Single", (float) 98.87);
        f1.displayFruit();
    }
}
