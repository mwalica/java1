package operatory;

public class Operatory {
    //wartości char, byte i short są promowane do int
    //jeśli jedno z argumentów wyrażenia jest typu long, całe wyrażenie jest promowane do long
    //jeśli jeden z argumentów jest typu float, całe wyrażenie jest promowane do typu float.
    // Jeśli jeden z argumentów jest double, wynik wyrażenia jest również tego typu
    public static void main(String[] args) {
        byte a = 2;
        short b = 4;
        int c = 6;
        long d = 8;
        float e = 8.23F;
        double f = 9.11;

        int result1 = a + b;//pomimo dodawania byte do short wynik jest int
        long result2 = c + d;

        float result3 = c + e;
        double result4 = e + f;
    }
}
