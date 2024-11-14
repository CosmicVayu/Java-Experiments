abstract class Figure {
    double pi = 3.1420;  

    public abstract void calcArea();   
    public abstract void calcVol();    
    public abstract void dispArea();   
    public abstract void dispVol();    
}
class Cone extends Figure {
    double n;  
    double s;  
    double a;  
    double v;  

    public Cone(double n, double s) {
        this.n = n;
        this.s = s;
    }

    @Override
    public void calcArea() {
        a = Math.PI * n * (n + s);  
    }

    @Override
    public void calcVol() {
        v = (Math.PI * n * n * s) / 3;  
    }

    @Override
    public void dispArea() {
        System.out.println("Cone Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Cone Volume: " + v);
    }
}
class Sphere extends Figure {
    double r;  
    double a;  
    double v;  

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public void calcArea() {
        a = 4 * Math.PI * r * r;  
    }

    @Override
    public void calcVol() {
        v = (4.0 / 3) * Math.PI * r * r * r;  
    }

    @Override
    public void dispArea() {
        System.out.println("Sphere Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Sphere Volume: " + v);
    }
}
class Cylinder extends Figure {
    double r;  
    double h;  
    double a;  
    double v;  

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void calcArea() {
        a = 2 * Math.PI * r * (r + h);  
    }

    @Override
    public void calcVol() {
        v = Math.PI * r * r * h;  
    }

    @Override
    public void dispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    @Override
    public void dispVol() {
        System.out.println("Cylinder Volume: " + v);
    }
}
public class Demo {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 7);
        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();

        Sphere sphere = new Sphere(6);
        sphere.calcArea();
        sphere.calcVol();
        sphere.dispArea();
        sphere.dispVol();

        Cylinder cylinder = new Cylinder(4, 10);
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.dispArea();
        cylinder.dispVol();
    }
}
