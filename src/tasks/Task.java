package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aska on 16.06.2016.
 */
public abstract class Task {
    public abstract String solution();
    public void printTask(String taskNumber, String condition){
        System.out.println("Task №" + taskNumber +":\n"+
        condition);
    };
    public abstract String getTaskNumber();
    public abstract String getTaskCondition();

    public int readPositiveNumber() throws IOException {
        System.out.println("Enter positive number n:");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Can't get input data.");
            throw e;
        }
        return n;
    }
}
