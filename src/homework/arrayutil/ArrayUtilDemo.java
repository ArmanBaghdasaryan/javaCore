package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 1, 70, -20, 8, 3, 5, 7, 2, 15, 20};
        ArrayUtil au = new ArrayUtil();
        System.out.println("max = " + au.max(numbers));


        System.out.println("min = " + au.min(numbers));


        System.out.println("even quantity = " + au.evenQuantity(numbers));


        System.out.println("odd quantity = " + au.oddQuantity(numbers));


        System.out.println("arithmetic mean = " + au.arithmeticMean(numbers));


        System.out.println("sum = " + au.sum(numbers));


        au.odd(numbers);
        System.out.println();


        au.count(numbers);
        System.out.println();


        au.array(numbers);









    }
}
