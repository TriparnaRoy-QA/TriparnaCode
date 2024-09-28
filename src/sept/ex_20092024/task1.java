package sept.ex_20092024;

public class task1 {
    public static void main(String[] args)
    {
        int a= 10;
        int b= 20;
        int c= 45;
        int tern= (a>b) ?(a>c ?a:c):(b>c ? b:c);
        System.out.println(tern);
    }
}
