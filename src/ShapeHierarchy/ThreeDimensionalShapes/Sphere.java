package ShapeHierarchy.ThreeDimensionalShapes;

import ShapeHierarchy.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
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
    public String toString() {
        return "Sphere{ " +
                "radius=" + radius +
                " }";
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}