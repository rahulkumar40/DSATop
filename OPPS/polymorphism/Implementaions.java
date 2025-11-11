package OPPS.polymorphism;

public class Implementaions {
    public void area(double radious) {
        double ar = Math.PI * Math.pow(radious, 2);
        System.out.println("Are of circle = " + ar);
    }

    public void area(int side) {
        int ar = side * side;
        System.out.println("Area of squre = " + ar);
    }

    public void area(int len, int breadth) {
        int ar = len * breadth;
        System.out.println("Area of reactangle = " + ar);
    }

    public static void main(String[] args) {
        Implementaions imp = new Implementaions();
        imp.area(10);
        imp.area(10.4);
        imp.area(4, 5);
    }
}
