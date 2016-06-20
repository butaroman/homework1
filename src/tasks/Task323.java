package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by nataliia on 18.06.16.
 */

    public class Task323 implements Task {

    @Override
    public void solution() {
        System.out.println("Умова задачі №323: ");
        System.out.println("Дано натуральное число n. Получить все натуральные числа, меньшие n и взаимно простые с ним. \n");
        System.out.println("Введіть натуральне число n: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        ArrayList<Integer> arrayList = calc(n);
        System.out.print("Відповідь: \nВзаємно прості числа, які менші числа " + n + ":\n");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i == arrayList.size() - 1) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
        }
    }

    ArrayList<Integer> calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int num = 1; num <= n; num++) {
            if (isPrime(num) && gcd(num, n) == 1) {
                result.add(num);
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int gcd(int a, int b) { // НСД
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

