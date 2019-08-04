package resize;

import shape.Circle;

public class ResizeCircle extends Circle implements ResizeShape {
    @Override
    public void resizeCircle(Circle circle, double size) {
        circle.setRadius(circle.getRadius()*size);
    }
}
