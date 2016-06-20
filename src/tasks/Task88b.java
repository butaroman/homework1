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
    public String solution() {
        try {
            number = readPositiveNumber();
        } catch (IOException e) {
            return "Input error!";
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Task88b task88b = (Task88b) o;

        return number == number;

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
