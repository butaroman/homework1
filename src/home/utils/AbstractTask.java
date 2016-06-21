package home.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aska on 16.06.2016.
 */
public abstract class AbstractTask {
    public abstract String solution() throws Exception;

    public void printTask(String taskNumber, String condition) {
        System.out.println("Task №" + taskNumber + ":\n" +
                condition);
    }

    public abstract String getTaskNumber();

    public abstract String getTaskCondition();

    public int readPositiveNumber() throws IOException {
        return readPositiveNumber("n");
    }

    public int readPositiveNumber(String variableName) throws IOException {
        System.out.println("Enter positive number " + variableName + ":");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Can't get input data.");
            throw e;
        } catch (NumberFormatException e){
            System.out.println("Non a number.");
            throw e;
        }
        return n;
    }
}