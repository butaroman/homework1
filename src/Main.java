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

        HashMap<String, Task> map = new HashMap<>();

        map.put("108", new Task108());
        map.put("325", new Task325());
        map.put("561", new Task561());


        boolean cont = true;
        while (cont) {
            System.out.println("Введіть № задачі");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String task = bufferedReader.readLine();

            for (Map.Entry<String, Task> pair : map.entrySet()) {
                if (pair.getKey().equals(task)) pair.getValue().solution();
            }

            System.out.println("Бажаєте продовжити? (y/n)");

            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

             if (bufferedReader.readLine().equals("y")) {
                cont = true;
            } else cont = false;
        }
    }

}

