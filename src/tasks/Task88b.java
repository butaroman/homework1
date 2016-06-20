package tasks;

import java.io.IOException;

/**
 * TASK:Given a positive integer n.
 * Make the reverse order of numbers.
 *
 * @author KarpenkoKO.
 * @version 1.0.
 */
public class Task88b extends Task {

    /**
     * @param number value from IO.
     */
    private int number;

    /**
     * Empty constructor fo class.
     */
    public Task88b() {
    }

    /**
     * Write new value of field.
     *
     * @param num .
     */
    public void setNumber(int num) {
        if (num <= 0) {
            System.out.println("Number should be a positive!");
            return;
        }
        number = num;
    }

    @Override
    public String solution() throws IOException {
            number = readPositiveNumber();
        return new StringBuilder(String.valueOf(number)).reverse().toString();
    }

    @Override
    public String getTaskNumber() {
        return "88б";
    }

    @Override
    public String getTaskCondition() {
        return "Given a positive integer n. \n"
                + "Make the reverse order of numbers.";
    }

    /**
     * Secure return number field.
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Task88b task88b = (Task88b) object;

        if (number != task88b.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return "Task88б{"
                + "n=" + number
                + '}';
    }

}
