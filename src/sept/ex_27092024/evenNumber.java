package sept.ex_27092024;

public class evenNumber {
    public static void main(String[] args) {
        System.out.println("First 5 even number are:");
        evenNumber();
    }
        static void evenNumber(){
            int cnt = 0;
            int number = 0;
            while (cnt < 5){
                if (number % 2 == 0){
                    cnt++;
                    System.out.print(number + " ");
                }
                number++;
            }
        }

    }

