package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by nataliia on 18.06.16.
 */
public class Task559 implements Task{ // Mersenne prime

    @Override
    public void solution() {
        System.out.println("Умова задачі №559: ");
        System.out.println("Дано натуральное число n. Найти все меньшие n числа Мерсена. "
                + "(Простое число называется числом Мерсена, если оно может быть представлено в виде 2p – 1, "
                + "где р – тоже простое число.) \n");
        System.out.println("Введіть натуральне число n: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.err.println("Не вдається отримати вхідні дані.");
        }

        ArrayList<Integer> arrayList = calc(n);
        System.out.print("Відповідь: \nРяд Мерсена для числа " + n + ":\n");
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
        int num = 0;
        int p = 2;
        while (num < n) {
            num = (int) (Math.pow(2, p) - 1);
            if (isPrime(p) && num <= n) {
                result.add(num);
            }
            p++;
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

}

