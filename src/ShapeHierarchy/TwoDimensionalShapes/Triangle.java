package ShapeHierarchy.TwoDimensionalShapes;

import ShapeHierarchy.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0)
            throw new IllegalArgumentException(
                    "Base must be > 0.0");
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            throw new IllegalArgumentException(
                    "Height must be > 0.0");
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{ " +
                "base=" + base +
                ", height=" + height +
                " }";
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}