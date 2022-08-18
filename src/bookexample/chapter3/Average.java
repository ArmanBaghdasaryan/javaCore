package bookexample.chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1,11.2,12.3,13.4,14.5};
        double results = 0;
        for (int i = 0; i < 5; i++) {
            results = results + nums[i];
            System.out.println("միջին արժեքը հավասար է "+results/5);
            
        }
    }
}
