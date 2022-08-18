package bookexample.chapter10;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("in the method procA()");
            throw new RuntimeException("Demonstracion");
        }finally {
            System.out.println("block operator finally in method procA()");
        }
    }
    static void procB(){
        try {
            System.out.println("in the method procB()");
            return;
        }finally {
            System.out.println("block operator finally in method procB()");
        }
    }
    static void procC(){
        try {
            System.out.println("in the method procC()");
        }finally {
            System.out.println("block operator finally in the method procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("exception intercepted");
        }
        procB();
        procC();
    }
}
