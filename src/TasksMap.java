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
		map.put("107", new Task107());
		map.put("243", new Task243());
		

        return map;
    }
}
