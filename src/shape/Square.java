package shape;

public class Square extends Rectangle{
    private double size = 0.0;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square() {
    }

    public Square( double size) {
        super(size, size);
    }

    public Square(boolean filled, String color, double size) {
        super(filled, color, size, size);
    }

    @Override
    public String toString() {
        return "A Square width size = "+ this.getWidth();
    }
}
