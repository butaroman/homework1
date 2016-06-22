package tasks;

import home.utils.AbstractTask;

import java.io.IOException;
import java.util.Arrays;

/**
 * TASK: Given a positive integer n.
 * Find out whether the number 3 in the record number n * n.
 *
 * @author KarpenkoKO.
 * @version 1.0.
 */
public class Task88a extends AbstractTask {

    /**
     * @param number value from IO.
     */
    private int number;

    /**
     * Empty constructor fo class.
     */
    public Task88a() {
    }

    /**
     * Get pow of number.
     *
     * @return pow of number.
     */
    private int powN() {
        return number * number;
    }

    /**
     * Find out whether the number 3 in the record number n * n.
     *
     * @return boolean value.
     */
    public boolean isPresentThree() {
        return Arrays.asList(String.valueOf(powN()).split("")).contains("3");
    }


    @Override
    public String solution() throws IOException {

        number = readPositiveNumber();

        if (isPresentThree()) {
            return "The number " + powN() + " contains the number 3";
        } else {
            return "The number " + powN() + " does not contain the number 3";
        }
    }

    @Override
    public String getTaskNumber() {
        return "88a";
    }

    @Override
    public String getTaskCondition() {
        return "Given a positive integer n. \n"
                + "Find out whether the number 3 in the record number n * n.";
    }

    /**
     * Give number of the field.
     *
     * @return number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Writing in field number param num.
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Task88a task88a = (Task88a) object;

        if (number != task88a.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public String toString() {
        return "Task88a{"
                + "n=" + number
                + '}';
    }
}