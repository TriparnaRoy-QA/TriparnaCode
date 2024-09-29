package sept.ex_2509;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num1= sc.nextInt();
        int num2=1;
        for(int i=num1; i>0; i--){
            num2 = num2 * i;
        }
        System.out.println("Factorial of" + num1 + "is:" + num2);
    }

}
