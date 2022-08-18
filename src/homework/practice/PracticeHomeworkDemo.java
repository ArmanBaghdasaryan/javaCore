package homework.practice;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework sec = new PracticeHomework();
        System.out.println(sec.convert(585));


        PracticeHomework days = new PracticeHomework();
        System.out.println(days.calcAge(5));


        PracticeHomework next = new PracticeHomework();
        System.out.println(next.nextNumber(55));


        PracticeHomework same = new PracticeHomework();
        System.out.println(same.isSameNum(10, 10));


        PracticeHomework bool = new PracticeHomework();
        System.out.println(bool.lessThanOrEqualToZero(-15));


        PracticeHomework negate = new PracticeHomework();
        System.out.println(negate.reverseBool(false));

        int[] array1 = {10, 5, 20, 50, 2, 8, 9};
        int[] array2 = {25, 5, 8, 6, 7, 9, 2, 8};
        PracticeHomework length = new PracticeHomework();
        System.out.println(length.maxLength(array1, array2));

    }
}
