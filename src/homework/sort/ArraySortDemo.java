package homework.sort;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] numbers = {15, 78, -20, 13, 14, 5, 7, 3};
        ArraySort as = new ArraySort();


        as.sort(numbers);
        System.out.println();

        as.sort1(numbers);
    }
}
