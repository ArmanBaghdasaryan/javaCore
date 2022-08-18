package bookexample.chapter4;

public class MultByTwo {
    public static void main(String[] args) {
        int num = 0xFFFFFFE;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);

        }
    }
}
