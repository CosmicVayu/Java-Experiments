
class WashingMachine {
    void switchOn() {
        System.out.println("Washing Machine is ON");
    }

    int acceptClothes(int noOfClothes) {
        System.out.println("Accepted " + noOfClothes + " clothes");
        return noOfClothes;
    }

    void acceptDetergent() {
        System.out.println("Detergent accepted");
    }

    void switchOff() {
        System.out.println("Washing Machine is OFF");
    }
}

public class Washing{

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.switchOn();
        int clothes = wm.acceptClothes(5); 
        wm.acceptDetergent();
        wm.switchOff();
    }
}
