package sept.ex_20092024;

public class task2grade {
    public static void main(String[] args){
        int score = 85;
        String grade=(score>=90) ? "A" :((score>=80)? "B": "C");
        System.out.println(grade);
    }
}
