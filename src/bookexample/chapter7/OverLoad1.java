package bookexample.chapter7;

public class OverLoad1 {
    public static void main(String[] args) {


        OverLoadDemo1 ol = new OverLoadDemo1();
        int i = 88;
        ol.test();
        ol.test(10, 20);
        ol.test(i);
        ol.test(123, 2);


    }
}
