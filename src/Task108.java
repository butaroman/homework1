import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aska on 15.06.2016.
 * 108. Дано натуральное число n.
 * Получить наименьшее число вида 2^r , превосходящее n.
 */

public class Task108 implements Task{

    public void solution() {
        System.out.println("Ви вибрали задачу №108.");
        System.out.println("Умова задачі: ");
        System.out.println("Дано натуральное число Получить наименьшее число вида 2^r , превосходящее n");
        System.out.println("Введіть параметр N - натуральне число");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("error");        }
        System.out.println(calc(n));
    }

    private int calc(int n){
        if (n<0) {
            throw new IllegalArgumentException("Argument n must be positive");
        }
        int r = 0;
        int result;
        while (true){
            if (Math.pow(2, r)>n) {
                result = (int) Math.pow(2, r);
                break;
            }
            else r++;
        }
        return result;
    }


}


