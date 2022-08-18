package homework.arrayutil;

public class ArrayUtil {
    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }


        return max;
    }

    int min(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;


    }

    int evenQuantity(int[] array) {
        int even = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int oddQuantity(int[] array) {
        int odd = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    double arithmeticMean(int[] array) {
        double mean = 0;
        for (int j : array) {
            mean = mean + j;

        }
        mean = mean / array.length;
        return mean;
    }

    int sum(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];

        }

        return sum;
    }

    void odd(int[] array) {


        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + " ");

            }
        }
    }

    void count(int[] array) {


        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(j + " ");

            }
        }
    }

    void array(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");


        }
    }


}


