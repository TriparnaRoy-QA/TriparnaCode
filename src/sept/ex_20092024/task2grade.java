package sept.ex_20092024;

public class task2grade {
    public static void main(String[] args){
        int score = 85;

        System.out.println(funGrade(score));
    }

    static String funGrade(int score){
        return score>=80 ? "B": "C";
    }
}
