import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aska on 15.06.2016.
 * 325. Дано натуральное число n. Получить все простые делители этого числа.
 */
public class Task325 implements Task{
    @Override
    public void solution() {
        System.out.println("Ви вибрали задачу №325.");
        System.out.println("Умова задачі: ");
        System.out.println("Дано натуральное число n. Получить все простые делители этого числа.");
        System.out.println("Введіть параметр N - натуральне число");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
             n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("error");        }
        System.out.println(calc(n));
    }


    private boolean isPrime(int n){
        if (n < 0) throw new IllegalArgumentException("Argument n must be positive");
        else if (n==0 || n == 1) return false;
        else if (n==2) return true;
        else for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
                if (n % i==0) return false;
            }
        return true;
    }

    private ArrayList<Integer> calc(int n){
        if (n < 0) throw new IllegalArgumentException("Argument n must be positive");
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) result.add(i);
        }
        return result;
    }
}
