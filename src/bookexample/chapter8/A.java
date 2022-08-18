package bookexample.chapter8;

public class A {
    int i, j;

    void showJ() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

