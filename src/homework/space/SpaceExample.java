package homework.space;

public class SpaceExample {


    void space(char[] spaseArray) {
        int startIndex = 0;
        int endIndex = spaseArray.length - 1;

        while (spaseArray[startIndex] == ' ') {
            startIndex++;

        }

        while (spaseArray[endIndex] == ' ') {
            endIndex--;

        }
        char[] result = new char[endIndex - startIndex + 2];
        int i = 0;
        while (i < result.length - 1) {
            i++;
            result[i] = spaseArray[startIndex];
            startIndex++;
            System.out.print(result[i]);


        }
    }
}
