package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;

    public int add(int value) {
        if (size == array.length) {
            extendArray();

        }
        array[size++] = value;
        return value;
    }

    private void extendArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");


        }

    }

    boolean isEmpty() {
        return size == 0;
    }

    int getByIndex(int index) {


        if (index > array.length) {
            return 0;

        }
        return array[index];
    }


    int getFirstIndexByValue(int value) {


        for (int i = 0; i < size; i++) {

            if (value == array[i]) {
                value = i;


            }
        }

        return value;
    }


    void set(int index, int value) {


        array[index] = value;
    }


    int delete(int index) {

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];

        }
        return size--;
    }

    void add(int index, int value) {

        for (int i = size + 1; i > index; i--) {
            array[i] = array[i - 1];

        }
        array[index] = value;
        size++;

    }
}







