package bookexample.chapter12;

public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;
        int i = iOb;
        System.out.println(i + " " + iOb);
    }
}
class AutoBox2{
    static int m(Integer v){
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}