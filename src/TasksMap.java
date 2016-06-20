import tasks.*;

import java.util.HashMap;

/**
 * Created by Aska on 17.06.2016.
 */
public class TasksMap {
    private HashMap<String, Task> map;

    public HashMap<String, Task> create(){
        map = new HashMap<>();

        map.put("87", new Task87());
        map.put("107", new Task107());
        map.put("108", new Task108());
        map.put("182", new Task182());
        map.put("243a", new Task243a());
        map.put("243b", new Task243b());
        map.put("323", new Task323());
        map.put("324", new Task324());
        map.put("325", new Task325());
        map.put("559", new Task559());
        map.put("561", new Task561());
        map.put("560", new Task560());

        return map;
    }
}
