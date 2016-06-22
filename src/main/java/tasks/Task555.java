package tasks;

import home.utils.AbstractTask;

import java.util.Scanner;

/**
 * Created by cavayman on 21.06.2016.
 */
public class Task555 extends AbstractTask {
    private static Scanner scan = new Scanner(System.in);
    @Override
    public String solution() throws Exception {
String resoult="";
        System.out.println("Enter number of rows that you want to see: ");
        int rows = scan.nextInt();
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                resoult+=number;
                number = number * (i - j) / (j + 1);
            }
        resoult+="\n";
        }

        return resoult;
    }

    @Override
    public String getTaskNumber() {
        return "555";
    }

    @Override
    public String getTaskCondition() {
        return "Write Pascal Triangle with count of rows that entered user.";
    }
}
