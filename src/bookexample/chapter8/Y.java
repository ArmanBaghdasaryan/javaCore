package bookexample.chapter8;

public class Y {
    int i, j;

    Y(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class M extends Y {
    int k;

    M(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);

    }
}
