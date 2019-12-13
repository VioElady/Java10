package ShapeHierarchy.TwoDimensionalShapes;

import ShapeHierarchy.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0)
            throw new IllegalArgumentException(
                    "Side must be > 0.0");
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                " }";
    }
}