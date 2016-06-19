import tasks.Task;
import tasks.*;


import java.util.HashMap;

/**
 * Created by Aska on 17.06.2016.
 */
public class TasksMap {
    private HashMap<String, Task> map;

    public HashMap<String, Task> create(){
        map = new HashMap<>();

        map.put("108", new Task108());
        map.put("325", new Task325());
        map.put("561", new Task561());
        map.put("86a", new Task86a());
        map.put("86b", new Task86b());
        map.put("330", new Task330());

        return map;
    }
}
