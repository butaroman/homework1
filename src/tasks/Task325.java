package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aska on 15.06.2016.
 */
public class Task325 implements Task {

    @Override
    public void solution() {
        System.out.println("Умова задачі №325: ");
        System.out.println("Дано натуральное число n. Получить все простые делители этого числа \n");
        System.out.println("Введіть натуральне число n: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;

        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        ArrayList<Integer> arrayList = calc(n);
        System.out.print("Відповідь: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i == arrayList.size() - 1) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
    }


    private ArrayList<Integer> calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) result.add(i);
        }
        return result;
    }

    private boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Метод не може отримувати від'ємне значення n.");
        }
        else if (n == 0 || n == 1) return false;
        else if (n == 2) return true;
        else for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
                if (n % i == 0) return false;
            }
        return true;
    }
	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return "325";
	}


	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Дано натуральное число n. Получить все простые делители этого числа \n";
	}
}
