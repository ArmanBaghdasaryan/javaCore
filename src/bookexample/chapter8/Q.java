package bookexample.chapter8;

public class Q {
    int i, j;

    Q(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class T extends Q {
    int k;

    T(int a, int b, int c) {
        super(a, c);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        T subOb = new T(1, 2, 3);
        subOb.show();
    }
}
