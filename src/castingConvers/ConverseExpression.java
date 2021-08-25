package castingConvers;

public class ConverseExpression {
    public static void main(String[] args) {
        int intNum = 22;
        long longNum = 22;
        float floatNum = 22.01F;
        double doubleNum = 22;

        char a = 'a';

        long result1 = intNum + longNum;
        int result2 = intNum + (int) longNum;

        double result3 = intNum + doubleNum;
        int result4 = intNum + (int) doubleNum;

        char result5 = (char) (a + intNum);
        int result6 = a + intNum;

        System.out.println(result5);
        System.out.println(result6);



    }
}
