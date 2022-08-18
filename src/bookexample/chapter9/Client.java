package bookexample.chapter9;

public class Client implements CallBack {

    public void callBack(int p) {
        System.out.println("Method callBack(), " + " вызываемый со значением " + p);
    }
}
