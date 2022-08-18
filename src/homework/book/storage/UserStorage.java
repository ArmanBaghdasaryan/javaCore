package homework.book.storage;


import homework.book.model.User1;

public class UserStorage {

    private User1[] array = new User1[10];
    private int size;

    public User1 add(User1 book) {
        if (size == array.length) {
            extendArray();

        }
        array[size++] = book;
        return book;
    }

    private void extendArray() {
        User1[] temp = new User1[array.length + 10];
        System.arraycopy(array, 0, temp, 0, size);
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);


        }

    }
    public User1 getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];

            }
        }
        return null;
    }

}







