import home.utils.AbstractTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aska on 16.06.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<String, AbstractTask> map = new TasksMap().create();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean cont = true;
        while (cont) {
            System.out.println("Choose task number:");

            String taskNumber = bufferedReader.readLine().replaceAll("\\W", "");

            AbstractTask task = null;
            for (Map.Entry<String, AbstractTask> pair : map.entrySet()) {
                if (pair.getKey().equals(taskNumber)) {
                     task = pair.getValue();
                    task.printTask(task.getTaskNumber(), task.getTaskCondition());
                    try {
                        System.out.println("Answer is: " + pair.getValue().solution());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            if (task==null) System.out.println("Task not found.");

            System.out.println("\nWant to continue? (y/n)");
            String answer;
            while (true) {
                answer = bufferedReader.readLine();
                if (answer.equalsIgnoreCase("n")) {
                    cont = false;
                    break;
                } else if (answer.equalsIgnoreCase("y")) {
                    cont = true;
                    break;
                }
                else {
                    System.out.println("Type y(for YES) or n(for NO):");
                }
            }
        }
    }
}
