package bookexample.chapter10;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("call method compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normal finish");
    }


    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("exception intercepted " + e);
        }
    }
}

