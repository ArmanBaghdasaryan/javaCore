package bookexample.chapter9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Objet type String default";


    }

    static int getDefaultNumber() {
        return 0;
    }

    int defNum = MyIf.getDefaultNumber();
}
