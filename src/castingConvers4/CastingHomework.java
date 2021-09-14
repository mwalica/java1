package castingConvers4;

public class CastingHomework {

    public static void main(String[] args) {
        //stworzyć zmienną num1 typu int i przypisać jej wartość 365
        int num1 = 365;
        //stworzyć zmienną num2 typu byte i przypisać jej wartość 3
        byte num2 = 3;
        //stworzyć zmienną letter typu char i przypisać jej wartość 'b'
        char letter = 'b';
        //stworzyć zmienną num3 typu double i przypisać jej wartość 23.45
        double num3 = 23.45;

        //stworzyć zmienną result1 typu long i przypisz do niej wartość num1 - w kometarzu napisać czy nastąpiła konwersja automatyczna czy konwersja jawna (popatrz do prezentacji o nazwie zmiennew Javie)
        long result1 = num1;
        //wydrukuj w konsoli według schematu z rysunku wartość num1 i result1
        System.out.println("num1 = " + num1);
        System.out.println("result1 = " + result1);
        System.out.println("=====");
        //stworzyć zmienna result2 typu byte i przypisz do niej wartośc num1 - w kometarzu napisać czy nastąpiła konwersja automatyczna czy konwersja jawna (popatrz do prezentacji o nazwie zmiennew Javie)
        byte result2 = (byte) num1;
        System.out.println("num1 = " + num1);
        System.out.println("result2 = " + result2);
        System.out.println("=====");
        //wydrukuj w konsoli według schematu z rysunku wartość num1 i result2

        //stworzyć zmienną result3 odpowiedniego typu, który powstanie z dodawania letter + num3
        //wynik tego dodawania wydrukować w konsoli
        double result3 = letter + num3;
        System.out.println("letter + num3 = " + result3);
        System.out.println("=====");

        //stworzyć zmienną result4 typu short, która będzie zawierać wynik mnożenia num1 i num3 (po odpowiednim rzutowaniu)
        short result4 = (short) (num1 * num3);
        //wynik mnożenia wydrukować w konsoli
        System.out.println("num1 * num3 = " + result4 + " (typ short)");

        //stworzyć zmienną result5 typu int, która będzie zawierać wynik mnożenia num2 i num3 (po odpowiednim rzutowaniu)
        int result5 = num2 * (int) num3;
        //wynik mnożenia wydrukować w konsoli
        System.out.println("num2 * num3 = " + result5 + " (typ int)");


    }
}
