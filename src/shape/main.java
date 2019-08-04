package shape;
import comparator.Circle;
import resize.ResizeShape;
import resize.ResizeCircle;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[2] = new Circle();
        circles[1]  = new Circle(2.2);
        circles[0] = new Circle(false,"dfasdf",5.5);

        System.out.println("before resize");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        ResizeShape resizeShape = new ResizeCircle();
        for(Circle circle : circles){
            resizeShape.resizeCircle(circle,3.3);
        }
        System.out.println("after resize");
        for (Circle circle: circles){
            System.out.println(circle);
        }

    }
}
