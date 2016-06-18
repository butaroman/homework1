package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aska on 18.06.2016.
 */
public class Helper {
    public void printTask(String taskNumber, String taskCondition) {
        System.out.println("Умова задачі №" + taskNumber + ": ");
        System.out.println(taskCondition);
    }

    public int getIntInput() {
        return Integer.parseInt(getStringInput());
    }

    public String getStringInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
            System.exit(0);
        }
        return "";
    }

    public void printSolution(String solution){
        System.out.println("Відповідь: " + solution);
    }
}
