package bookexample.chapter8;

abstract class P {
    abstract void callMe();

    void callMeToo() {
        System.out.println("Этo конкретный метод.");
    }
}

class N extends P {
    void callMe() {
        System.out.println("Реализация метода callMe() в классе N.");

    }
}

class AbstractDemo {
    public static void main(String[] args) {
        N n = new N();
        n.callMe();
        n.callMeToo();
    }
}
