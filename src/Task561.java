import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** The {@code Task561} class represents calculate of the task561.
 * @author aska
 * Created 15.06.2016.
 * Task 561: Дано натуральное число n.
 * Среди чисел 1, ...,
 * n найти все такие, запись которых
 * совпадает с последними цифрами
 * записи их kвадрата
 * (как, например, 6^2= 36, 25^2 = 625 и т. д.).
 */
public class Task561 implements Task{

    @Override
    public void solution() {
        System.out.println("Ви вибрали задачу №325.");
        System.out.println("Умова задачі: ");
        System.out.println("Дано натуральное число n. Среди чисел 1, ...,   n найти все такие, запись которых  " +
                "совпадает с последними цифрами\n" +
                " записи их kвадрата\n" +
                " (как, например, 6^2= 36, 25^2 = 625 и т. д.");
        System.out.println("Введіть параметр N - натуральне число");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("error");        }
        System.out.println(calc(n));
    }

    /** This private method solves task 561.
     * @param n incoming positive number
     * @exception IllegalArgumentException if param isn't positive */
    private ArrayList<Integer> calc(int n) {
        if (n <= 0) {
            throw
                    new IllegalArgumentException("Argument n must be positive");
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isFinishedWithSquareNumber(i)) {
                result.add(i);
            }
        }

        return result;
    }

    /** This private method is for internal usage.
     * @param n incoming positive number
     * @exception IllegalArgumentException if param isn't positive
     * @return true if record of param value matches
     * the last digits of record of its square */
    private boolean isFinishedWithSquareNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument n must be positive");
        }
        String s = "" + (int) Math.pow(n, 2);
        return  (s.endsWith("" + n));
    }

}

