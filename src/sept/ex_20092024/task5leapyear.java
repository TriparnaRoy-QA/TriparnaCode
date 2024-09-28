package sept.ex_20092024;

public class task5leapyear {
    public static void main(String[] args){
        int year=2024;
        boolean leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (leapyear)
        {
            System.out.println(year+ "This is leapyear");
        }
        else {
            System.out.println(year+ "This is not leapyear");
        }
    }
}
