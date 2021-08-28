package castingConvers;

public class Casting {
    public static void main(String[] args) {

        //mniejszy do wiekszego
        // byte->short->int->long->float->double

        long num1 = 126;
        double num2 = num1;


        //wiekszy do mniejszego
        //double->float->long->int->short->byte

        short a = 130;
        byte b = (byte) a;


        System.out.println("Short " + a + " = byte " + b);

    }
}
