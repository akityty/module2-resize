package comparator;
import shape.Circle;
public interface Comparator extends java.util.Comparator<Circle> {
   public int compare(Circle c1, Circle c2);
}
