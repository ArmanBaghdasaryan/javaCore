package bookexample.chapter9;

public class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Чиcлo 10 неотрицательное");
            if (nif.isNotNegative(-12)) {
                System.out.println("Этo не будет выведено");
            }
        }
    }
}

