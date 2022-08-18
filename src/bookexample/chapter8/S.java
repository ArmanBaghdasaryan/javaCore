package bookexample.chapter8;

public class S {
    void callMe() {
        System.out.println("method callMe() from class S");
    }
}

class D extends S {
    void callMe() {
        System.out.println("method callMe() from class D");
    }
}

class F extends S {
    void callMe() {
        System.out.println("method callMe() from class F");

    }
}

