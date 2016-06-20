package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aska on 15.06.2016.
 */

public class Task108 implements Task {

    @Override
    public void solution() {
        System.out.println("Умова задачі №108: ");
        System.out.println("Дано натуральное число n. Получить наименьшее число вида 2^r, превосходящее n. \n");
        System.out.println("Введіть натуральне число n: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        int r = 0;
        try {
            r = calc(n);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Відповідь: 2^" + r + "=" + (int) Math.pow(2, r));

    }

    private int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        int r = 0;
        int result;
        while (true) {
            if (Math.pow(2, r) > n) {
                result = r;
                break;
            } else r++;
        }
        return result;
    }
	@Override
	public String getNumber() {
		  
		return "108";
	}

	@Override
	public String getDiscription() {
		return "Дано натуральное число n. Получить наименьшее число вида 2^r, превосходящее n. \n";
	}
}



