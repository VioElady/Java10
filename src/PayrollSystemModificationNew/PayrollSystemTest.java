package PayrollSystemModificationNew;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Leo", "Lewis", "876-44-4444", 5000, .04, 300);
        PieceWorker pieceWorker1 = new PieceWorker("Andrew", "Petrov", "7634-234234-234", 300, 10);
        PieceWorker pieceWorker2 = new PieceWorker("Ion", "Aliana", "49834-223454-234", 27, 100);
        PieceWorker pieceWorker3 = new PieceWorker("Dlexey", "Llamadiala", "376346-224234-234", 1200, 17);


        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[7];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker1;
        employees[5] = pieceWorker2;
        employees[6] = pieceWorker3;

        System.out.printf("Employees processed polymorphically :%n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof PieceWorker) {
                PieceWorker employee =
                        (PieceWorker) currentEmployee;
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());

            }

        }

    }
}

