class Figure {
    double r;  
    double a;  
    double v;  

    
    public void dispArea() {
        System.out.println("Area: " + a);
    }

  
    public void dispVolume() {
        System.out.println("Volume: " + v);
    }
}
class Cone extends Figure {
    double h;  
    double s;  

    
    public Cone(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
        calcArea();
        calcVolume();
    }

    
    public void calcArea() {
        a = Math.PI * r * (r + s);
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 7, 10); 

        cone.dispArea();
        cone.dispVolume();
    }
}
