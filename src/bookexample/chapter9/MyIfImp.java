package bookexample.chapter9;

public class MyIfImp implements MyIf {
    public int getNumber() {
        return 100;

    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIfImp obj = new MyIfImp();
        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
    }
}
