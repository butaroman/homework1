package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nazar.dovhyy on 20.06.2016.
 */
public class Task182 extends Task {

    private int[] arrOfNumbs;

    @Override
    public String solution() {
        int n = 0;
        try {

            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        try {
            int sum = findSumOnConditionFor(n);
            return "" + sum;

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage()+"\n");
        }
        return "";
    }

    @Override
    public String getTaskNumber() {
        return "182";
    }

    @Override
    public String getTaskCondition() {
        return "Given a natural number of n, find sum of all numbers (a1....a(n)) divided by 5 and not divided by 7.";
    }

    private int findSumOnConditionFor(int number) {

        int sum =0;

        fillArrayOfNumbers(number);

        for(int i=0; i<arrOfNumbs.length; i++){

            if(i % 5==0 && i % 7 !=0){
                sum += i;
            }

        }

        return sum;
    }

    private void fillArrayOfNumbers(int number) {

            checkForValidBoundaries(number);

            fillInArrayWithNumbers(number);

    }

    private void fillInArrayWithNumbers(int scope) {

        int count=0;

        arrOfNumbs = new int[scope];

        while(count<scope){
            arrOfNumbs[count++]=count;
        }

    }

    private void checkForValidBoundaries(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("wrong array bounds specified: "
                    + number);
        }

    }
}
