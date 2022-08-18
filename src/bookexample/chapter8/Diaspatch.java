package bookexample.chapter8;

public class Diaspatch {
    public static void main(String[] args) {
        S s = new S();
        D d = new D();
        F f = new F();

        S r;
        r = d;
        r.callMe();

        r = f;
        r.callMe();

        r = d;
        r.callMe();
    }
}
