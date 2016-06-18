package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nataliia on 18.06.16.
 */
public class Task87 implements Task {

    @Override
    public void solution() {
        System.out.println("Умова задачі №87: ");
        System.out.println("Даны натуральное n, m. Получить сумму m последних цифр числа n. \n");
        System.out.println("Введіть натуральне число n: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        System.out.println("Введіть натуральне число m: ");
        int m = 0;
        try {
            m = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        int r = 0;
        try {
            r = calc(n,m);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Відповідь: Сума " + m + " останніх чисел числа " + n + " = " + calc(n,m));
    }

        int calc(int n, int m) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        if (m < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, m не може бути від'ємним.");
        }
        int result = 0;
        for (int i = 0; i < m; i++) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
