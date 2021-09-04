package scope6;

public class Scope {

    public static void main(String[] args) {
        int a = 3;
        int c;
        {
            int b = 5;
            int result = a + b;
           //System.out.println(c);
        }


    }
}
