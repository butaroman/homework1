package my.homework.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Aska on 16.06.2016.
 */
public class Main {

	public static void main(String[] args) throws IOException {

		HashMap<String, Task> map = new TasksMap().getMap();
		System.out.println(map.keySet());
		boolean cont = true;
		while (true) {
			System.out.println("Введіть № задачі:");
			Scanner sc = new Scanner(System.in);
			String task = sc.nextLine();
			Task temp = map.get(task);
			System.out.println(temp.getDiscription());
			temp.solution();

			System.out.println("\nБажаєте продовжити? (y/n)");
			if (sc.nextLine().toLowerCase().equals("n"))
				return;
            }
        
	
    }
}