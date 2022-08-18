package bookexample.chapter8;

public class J {
    int i;


}
class I extends J {
    int i;

    I(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        I subOb1 = new I(1, 2);
        subOb1.show();
    }
}