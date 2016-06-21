package home.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Aska on 16.06.2016.
 */
public class Main {

	public static void main(String[] args) throws IOException {

		TreeMap<String, AbstractTask> map = new TreeMap<String,AbstractTask>( new TasksMap().getMap());
		
		System.out.println(map.keySet());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean cont = true;
			while (cont) {
				System.out.println("Choose task number:");
				String taskNumber = bufferedReader.readLine().replaceAll("\\W", "");
				try{
					AbstractTask currentTask = map.get(taskNumber);
					System.out.println(currentTask.getTaskCondition());
					System.out.println("Answer is: " + currentTask.solution());
				}catch(NullPointerException e){
					System.out.println("Enter other value"); //If user entered number that isnt in HashMap
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
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
						} else {
							System.out.println("Type y(for YES) or n(for NO):");
						}
					}
	
			}
	}
}
