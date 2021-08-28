package finalVar3;

public class FinalVar {
    public static void main(String[] args) {
        int num1 = 20;
        final int num2 = 23;
        final String str = "Ciąg znaków";
        final Numbers numObj = new Numbers();
        //zamienić nazwy na wielkie litery


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
        System.out.println(numObj);
        System.out.println("=======");

        num1 = 30;
        numObj.x = 400;
        //numObj = new Numbers();//kolejny obiekt klasy Numbers error
        //num2 = 24; -> error
        //str = "Inny ciąg znaków"; -> error

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
        System.out.println(numObj);


    }
}
