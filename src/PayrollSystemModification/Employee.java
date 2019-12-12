package PayrollSystemModification;// Fig. 10.4: Employee.java
// Employee abstract superclass.

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthday;

    // constructor
    public Employee(String firstName, String lastName,
                    String socialSecurityNumber, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthday = birthday;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s %nemployee’s birthday: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(),getBirthday());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee