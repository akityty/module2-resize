package resize;

import shape.Circle;
import shape.Rectangle;

public class ResizeRectangle extends Rectangle implements ResizeShape {
    @Override
    public void resizeCircle(Circle circle, double size) {

    }

    @Override
    public void resizeRectangle(Rectangle rectangle, double size) {
        rectangle.setWidth(rectangle.getWidth()*size);
        rectangle.setHeight(rectangle.getHeight()*size);
    }
}
