package temp;

public class ExampleVar {
    int a = 23; //to nie jest zmienna lokalna

    {
        int b = 45;//to jest zmienna lokalna
    }
    public static void main(String[] args) {
        int c = 45;//to jest zmienna lokalna
        {
            int d = 100;
            System.out.println("zmienna x: " + c);
            System.out.println("zmienna x: " + d);
        }
        System.out.println("zmienna x: " + c);
//        System.out.println("zmienna x: " + d);zmienna d jest poza tym zakresem
    }
}
