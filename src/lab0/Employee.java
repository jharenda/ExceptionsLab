package lab0;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public int max = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
// can skip validation for ssn

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        // initialize a bunch of default values
        setFirstName(firstName);
        setLastName(lastName);
        setDaysVacation(daysVacation);
        setSsn(ssn);

    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < 0 || daysVacation > max) {
            throw new IllegalArgumentException("Sorry vacation days must be between -30 and 30");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() || "Unknown".equals(firstName)) {
            throw new IllegalArgumentException("First Name cannot be null, empty or Unknown");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        // should have validation- but can skip for now
        this.ssn = ssn;
    }

}
