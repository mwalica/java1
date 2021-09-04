package keywordVar5;

public class KeywordVar {

    //var num3 = 34 wnioskowanie dzial tylko dla zmiennych lokalnych -> tutaj nie zadziala
    public static void main(String[] args) {
        int num1 = 22;
        var num2 = 3.22; //wnioskowanie typow zadziala
//        var num3; to jest niedozwolone przy var zmienna musi byc od razu zainicjalizowana
    }
}
