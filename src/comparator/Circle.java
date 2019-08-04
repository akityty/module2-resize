package comparator;

public class Circle extends shape.Circle implements Comparable<Circle> {
    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color, radius);
    }

    @Override
    public int compareTo(Circle o) {
        if(getRadius()>o.getRadius()) return 1;
        else if(getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
