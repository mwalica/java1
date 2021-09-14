public class Temp {

    private int a = 367;

    public static void main(String[] args) {
        int a = 34;
    }

    public static void method1(int b) {
        Temp t1 = new Temp();
        int a = 23;
        int result = a + t1.a;
        {
            a = 87;
        }
    }


}
