package home.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Aska on 17.06.2016.
 */
public class TasksMap {
	private HashMap<String, AbstractTask> map = new HashMap<String, AbstractTask>();
	private static final String PATH_NAME = "src/tasks/";

	/**
	 * Конструктор який шукає файли Задачі в пекеджі, заповнює мапу номером
	 * задачі та передає туди обєкт.
	 */
	public TasksMap() {
		File directory = new File(PATH_NAME);
		for (File file : directory.listFiles()) {
			if (file.getName().contains("Task")) {
				try {
					Class temp = Class.forName("tasks." + file.getName().substring(0, file.getName().indexOf(".")));
					Object obj = temp.newInstance();
					AbstractTask tempurarTaskobject = (AbstractTask) obj;
					addToMap(tempurarTaskobject.getTaskNumber(), tempurarTaskobject);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void addToMap(String key, AbstractTask value) {
		map.put(key, value);

	}

	/**
	 * Gets current HashMap It must be filled by constructor.
	 * 
	 * @return
	 */
	public HashMap<String, AbstractTask> getMap() {
		return map;
	}

	public void runTask(String number) throws Exception {
		AbstractTask temp = map.get(number);
		temp.solution();
	}

}
