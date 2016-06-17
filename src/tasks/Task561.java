package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The {@code tasks.Task561} class represents calculate of the task561.
 *
 * @author aska
 *         Created 15.06.2016.
 *         Task 561: Дано натуральное число n.
 *         Среди чисел 1, ...,
 *         n найти все такие, запись которых
 *         совпадает с последними цифрами
 *         записи их kвадрата
 *         (как, например, 6^2= 36, 25^2 = 625 и т. д.).
 */
public class Task561 implements Task {

    @Override
    public void solution() {
        System.out.println("Умова задачі №561: ");
        System.out.println("Дано натуральное число n. Среди чисел 1, ...,   n найти все такие, запись которых  " +
                "совпадает с последними цифрами" +
                " записи их квадрата" +
                " (как, например, 6^2= 36, 25^2 = 625 и т. д.\n");
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

    /**
     * This private method solves task 561.
     *
     * @param n incoming positive number
     * @throws IllegalArgumentException if param isn't positive
     */
    private ArrayList<Integer> calc(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isFinishedWithSquareNumber(i)) {
                result.add(i);
            }
        }

        return result;
    }

    /**
     * This private method is for internal usage.
     *
     * @param n incoming positive number
     * @return true if record of param value matches
     * the last digits of record of its square
     * @throws IllegalArgumentException if param isn't positive
     */
    private boolean isFinishedWithSquareNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введіть коректне значення, n не може бути від'ємним.");
        }
        String s = "" + (int) Math.pow(n, 2);
        return (s.endsWith("" + n));
    }

}

