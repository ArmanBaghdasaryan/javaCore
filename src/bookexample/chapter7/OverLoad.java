package bookexample.chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ol = new OverLoadDemo();
        double result;
        ol.test();
        ol.test(10);
        ol.test(10, 20);
        result = ol.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);

    }
}
