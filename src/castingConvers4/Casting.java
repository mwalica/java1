package castingConvers4;

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


        System.out.println("short " + a + " = byte " + b);

        double d = 123.8734589379847598334583984579837453948573845;
        int e = (int) d;
        float f = (float) d;

        System.out.println("double " + d + " = int " + e);
        System.out.println("double " + d + " = float " + f);

    }
}
