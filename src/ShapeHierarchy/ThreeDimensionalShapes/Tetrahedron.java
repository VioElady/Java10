package ShapeHierarchy.ThreeDimensionalShapes;

import ShapeHierarchy.ThreeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
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
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.sqrt(2) / 12 * Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Tetrahedron{ " +
                "side=" + side +
                " }";
    }
}