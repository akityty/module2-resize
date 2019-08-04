package resize;

import shape.Circle;
import shape.Rectangle;
import shape.Square;

public class ResizeSquare extends Square implements ResizeShape {
    @Override
    public void resizeCircle(Circle circle, double size) {

    }

    @Override
    public void resizeRectangle(Rectangle rectangle, double size) {

    }

    @Override
    public void resizeSquare(Square square, double size) {
        square.setWidth(square.getSize()*size);
    }
}
