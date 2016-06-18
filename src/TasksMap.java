import tasks.Task;
import tasks.Task87;
import tasks.Task108;
import tasks.Task323;
import tasks.Task325;
import tasks.Task559;
import tasks.Task561;

import java.util.HashMap;

/**
 * Created by Aska on 17.06.2016.
 */
public class TasksMap {
    private HashMap<String, Task> map;

    public HashMap<String, Task> create(){
        map = new HashMap<>();

        map.put("87", new Task87());
        map.put("108", new Task108());
        map.put("323", new Task323());
        map.put("325", new Task325());
        map.put("559", new Task559());
        map.put("561", new Task561());


        return map;
    }
}
