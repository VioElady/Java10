package ShapeHierarchy.TwoDimensionalShapes;

import ShapeHierarchy.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException(
                    "Radius must be > 0.0");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius=" + radius +
                " }";
    }
}