package bookexample.chapter5;

public class Nobody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < --j) ;
        System.out.println("միջին արժեքը հավասար է" + i);

    }
}
