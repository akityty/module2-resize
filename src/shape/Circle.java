package shape;
import comparator.Comparator;

public class Circle extends Shape {
    private double radius = 0.0;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = "+this.getRadius();
    }
}
