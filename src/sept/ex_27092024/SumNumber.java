package sept.ex_27092024;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
        for (i = 1; i <= num; ++i) {
            sum = sum + i;
        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}