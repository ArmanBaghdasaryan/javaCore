package bookexample.chapter12;

public class AutoBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;

        System.out.println("dOb после выражения: " + dOb);

        Integer iOb1 = 2;
        switch (iOb1){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error");
        }
    }
}
