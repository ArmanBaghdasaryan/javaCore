package homework.arrayutil;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {10, 25, -35, 8, 98, -3, 45, 7, 13, 77};


        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i; j++) {


                if (num[j] < num[j - 1]) {
                    int tmp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = tmp;
                }

            }
        }
        for (int a : num) {
            System.out.print(a + " ");

        }
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length - i; j++) {


                if (num[j] > num[j - 1]) {
                    int sort = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = sort;
                }
            }
        }
        for (int a : num) {
            System.out.print(a + " ");
        }

    }
}
