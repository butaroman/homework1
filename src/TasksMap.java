package my.homework.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Aska on 17.06.2016.
 */
public class TasksMap {
	private HashMap<String, Task> map=new HashMap<String,Task>();
	private static final String PATH_NAME = "src/tasks/";

	/**
	 * Конструктор який шукає файли Задачі в пекеджі, заповнює мапу номером
	 * задачі та передає туди обєкт.
	 */
	public TasksMap() {
		// try {
		File directory = new File(PATH_NAME);
		for (File file : directory.listFiles()) {
			if(file!=null){
			try {
				Class temp = Class.forName("my.homework.tasks." + file.getName().substring(0, file.getName().indexOf(".")));
				Object obj = temp.newInstance();
				Task tempurarTaskobject = (Task) obj;
				addToMap(tempurarTaskobject.getNumber(), tempurarTaskobject);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}}
	}

	/**
	 * Add to map some Tasks 8-)
	 * 
	 * @param key
	 *            Number of Task.
	 * @param value
	 *            Object fo Task.
	 */
	public void addToMap(String key, Task value) {
		map.put(key, value);

	}

	/**
	 * Gets current HashMap It must be filled by constructor.
	 * 
	 * @return
	 */
	public HashMap<String, Task> getMap() {
		return map;
	}

	public void runTask(String number) {
		Task temp = map.get(number);
		temp.solution();
	}

}
