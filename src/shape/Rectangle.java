package shape;

public class Rectangle extends Shape {
    private double width = 0.0;
    private double height = 0.0;
    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(boolean filled, String color, double width, double height) {
        super(filled, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Rectangle with Width = "+this.width +" and " +this.height;
    }
}
