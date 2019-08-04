package shape;

import comparator.*;

public class Cylinder extends Circle {
    private double heigth = 0.0;
    public Cylinder(){

    }

    public Cylinder(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double radius, double heigth) {
        super(radius);
        this.heigth = heigth;
    }

    public Cylinder(boolean filled, String color, double radius, double heigth) {
        super(filled, color, radius);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolume(){
        return super.getArea()*this.heigth;
    }
    @Override
    public String toString() {
        return "A Cylinder with heigth = " + this.heigth+"and radius = "+super.getRadius();

    }
}
