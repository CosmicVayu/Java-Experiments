

abstract class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void displayModel() {
        System.out.println("Model: " + model);
    }

    abstract void avg();
    abstract void mode();
}

class Maruti extends Car {
    Maruti(String model) {
        super(model);
    }

    void avg() {
        System.out.println("Maruti average: 15 km/l");
    }

    void mode() {
        System.out.println("Maruti mode: Manual");
    }
}

class Audi extends Car {
    Audi(String model) {
        super(model);
    }

    void avg() {
        System.out.println("Audi average: 18 km/l");
    }

    void mode() {
        System.out.println("Audi mode: Automatic");
    }
}

public class Car1 {
    public static void main(String[] args) {
        Car car1 = new Maruti("Maruti Swift");
        car1.displayModel();
        car1.avg();
        car1.mode();

        Car car2 = new Audi("Audi Q8");
        car2.displayModel();
        car2.avg();
        car2.mode();
    }
}
