package bookexample.chapter9;

class AnotherClient implements CallBack {
    public void callBack(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
