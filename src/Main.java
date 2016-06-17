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

        boolean cont = true;
        while (cont) {
            System.out.println("Введіть № задачі:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String task = bufferedReader.readLine();

            for (Map.Entry<String, Task> pair : map.entrySet()) {
                if (pair.getKey().equals(task)) pair.getValue().solution();
            }

            System.out.println("\nБажаєте продовжити? (y/n)");
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
