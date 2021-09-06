package operatory;

public class Operatory2 {
    public static void main(String[] args) {
        int a = 10;
        double b = 2.5;

        int c = 125;
        int d = 13;

        double result1 = a + b;
        int result2 = (int) (a + b);
        int result3 = c/d;
        double result4 = (double) (c/d);//i tak wychodzi liczba, która ma po zrzecinku 13.0
        double result5 = (double)c/d;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
