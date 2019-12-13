package PayrollSystemModificationNew;


public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPieces(pieces);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException(
                    "Wage must be > 0.0");
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        if (pieces < 0)
            throw new IllegalArgumentException(
                    "The number of pieces produced must be > 0");
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }
}