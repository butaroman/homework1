package tasks;


import home.utils.AbstractTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nazar.dovhyy on 20.06.2016.
 */
public class Task324 extends AbstractTask {


    @Override
    public String solution() {
        int n = 0;
        try {

            n = readPositiveNumber();
        } catch (IOException e) {
            return "";
        }

        String output = null;
        List<Integer> allPrimeNumbers = findAllPrimeNumbersFor(n);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < allPrimeNumbers.size(); i++) {

            output = getFormattedOutput(i, allPrimeNumbers, builder).toString();
        }

        return output;
    }

    @Override
    public String getTaskNumber() {
        return "324";
    }

    @Override
    public String getTaskCondition() {
        return "Given a natural number n. Find all numbers less than n being mutually prime with n.";
    }

    private StringBuilder getFormattedOutput(int index, List<Integer> allPrimeNumbers, StringBuilder builder) {

        return (index < allPrimeNumbers.size() - 1) ? builder.append(allPrimeNumbers.get(index)).append(", ")
                : builder.append(allPrimeNumbers.get(index)).append(".");
    }

    private List<Integer> findAllPrimeNumbersFor(int number) {

        InnerNumberHolder.fillArrayHolder(number);

        return primeNumbersForN(number);
    }

    private List<Integer> primeNumbersForN(int number) {

        List<Integer>  primeNumbers = InnerNumberHolder.returnAllPrimeNumbersFor(number);

        return primeNumbers;
    }


    /**
     * added for testing purposes
     */
    public static class InnerNumberHolder {

        /**
         * array holder.
         */
        private static int[] arr;

        private static List<Integer> returnAllPrimeNumbersFor(int number) {

            List<Integer> innerPrimeNumberList = new ArrayList<>();

            for (int i = number; i < number + 1; i++) {

                for (int j = 0; j < arr.length; j++) {

                    if (retPrimeNumber(i, arr[j]) == 1) {

                        innerPrimeNumberList.add(arr[j]);
                    }

                }
            }

            return innerPrimeNumberList;
        }


        public static int retPrimeNumber(int firstNum, int secNum) {

            if (firstNum % secNum == 0) {
                return secNum;
            }

            return retPrimeNumber(secNum, firstNum % secNum);
        }

        public static int[] fillArrayHolder(int number) {

            if (number < 1) {
                throw new IllegalArgumentException("the input number must be larger than 0");
            }

            return fillArrayHolderWithNumbers(number - 1);

        }

        private static int[] fillArrayHolderWithNumbers(int number) {

            arr = new int[number];

            int count = 0;

            while (count < arr.length) {
                arr[count++] = count;
            }

            return arr;
        }
    }
}
