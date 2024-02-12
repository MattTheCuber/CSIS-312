// PieceWorker.java
// PieceWorker class extends Employee.

public class PieceWorker extends Employee  {
    private double wage; // wage per hour
    private int pieces; // pieces produced

    // constructor
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);

        // validate wage
        if (wage < 0.0) throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        // validate peices
        if (pieces < 0) throw new IllegalArgumentException("Pieces must be >= 0");

        this.wage = wage;
        this.pieces = pieces;
    }

    // set wage
    public void setWage(double wage) {
        // validate wage
        if (wage < 0.0) throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set pieces
    public void setPieces(int pieces) {
        // validate pieces
        if (pieces < 0) throw new IllegalArgumentException("Pieces must be >= 0");

        this.pieces = pieces;
    }

    // return pieces
    public int getPieces() {
        return pieces;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    // return String representation of PieceWorker object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,d", super.toString(), "hourly wage", getWage(), "pieces", getPieces());
    }
} // end class PieceWorker
