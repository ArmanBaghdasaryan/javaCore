package homework.bracechecker;

public class BraceCheckerTest {
    public static  void main(String[] args) {

        BraceChecker bc = new BraceChecker("))((hello[}{}()) from java(((");
        bc.check();



    }

}