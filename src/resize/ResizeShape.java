package resize;

import shape.Circle;
import shape.Rectangle;
import shape.Square;

public interface ResizeShape {
    public void resizeCircle(Circle circle, double size);
    public void resizeRectangle(Rectangle rectangle, double size);
    public  void resizeSquare(Square square, double size);
}
