

class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
    void maxSpeed(){
        System.out.println("Max spped is not specified");
    }
}

class Car extends Vehicle {
    Car(String make, String model) {
        super(make, model);
    }

    void maxSpeed() {
        System.out.println("Max Speed of Car: 200 km/h");
    }
}

class Bicycle extends Vehicle {
    Bicycle(String make, String model) {
        super(make, model);
    }

    void maxSpeed() {
        System.out.println("Max Speed of Bicycle: 30 km/h");
    }
}

class Scooter extends Vehicle {
    Scooter(String make, String model) {
        super(make, model);
    }

    void maxSpeed() {
        System.out.println("Max Speed of Scooter: 80 km/h");
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla");
        car.displayInfo();
        car.maxSpeed();

        Vehicle bicycle = new Bicycle("Hero", "Ranger");
        bicycle.displayInfo();
        bicycle.maxSpeed();

        Vehicle scooter = new Scooter("Honda", "Activa");
        scooter.displayInfo();
        scooter.maxSpeed();
    }
}
