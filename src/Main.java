import tasks.Task;

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

        HashMap<String, Task> map = new TasksMap().create();

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean cont = true;
        while (cont) {
            System.out.println("Choose task number:");

            String taskNumber = bufferedReader.readLine().trim();

            Task task = null;
            for (Map.Entry<String, Task> pair : map.entrySet()) {
                if (pair.getKey().equals(taskNumber)) {
                     task = pair.getValue();
                    task.printTask(task.getTaskNumber(), task.getTaskCondition());
                    System.out.println("Answer is: " + pair.getValue().solution());
                }
            }
            if (task==null) {
                System.out.println("Not found.");
            }

            System.out.println("\nWant to continue? (y/n)");
            String answer;
            while (true) {
                answer = bufferedReader.readLine();
                if (answer.equals("n")) {
                    cont = false;
                    break;
                } else if (answer.equals("y")) {
                    cont = true;
                    break;
                }
            }
        }
    }
}
