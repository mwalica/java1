package variable;

public class Primitive {

    public static void main(String[] args) {
        int age = 56;

        //boolean 1b
        boolean isProgrammer = true;
        //byte -128 do 127 -> 8b

        byte numByte = (byte) -129;
        System.out.println(numByte);

        //short -32 768 do 32 767 -> 16b
        short numShort = 20000;
        System.out.println(numShort);

        //int -2 147 483 648 do 2 147 483 647 -> 32b
        int numInt = 2_100_000_000;
        int hex = 0xFF;
        int oct = 077;
        int binary = 0b101;
        //long -9 223 372 036 854 775 808 do 9 223 372 036 854 775 807 -> 64b
        long numLong = 9000000000000000000L;

        //float około ±3,40282347E+38F (6 – 7 znaczących cyfr dziesiętnych)
        float floatNum = 1.2301111111F;

        //double około ±1,79769313486231570E+308 (15 znaczących cyfr dziesiętnych)
        double doubleNUm = 1.2311212121212121221212121212;

        double numA = 1.34;
        double numB = 0.21;
        System.out.println("1.34 - 0.21 = " + (numA - numB));


        //char 16b
        char a = 'a';
        char un = 97;

        System.out.println(a);
        System.out.println(un);
        System.out.println(a == un);
    }

}
