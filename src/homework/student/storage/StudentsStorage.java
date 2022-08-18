package homework.student.storage;

import homework.student.model.Student;

public class StudentsStorage {

    private Student[] array = new Student[10];
    private int size;

    public Student add(Student student) {
        if (size == array.length) {
            extendArray();

        }
        array[size++] = student;
        return student;
    }

    private void extendArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);


        }

    }

    boolean isEmpty() {
        return size == 0;
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {

            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
        }
    }

    public void printStudentByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().getName().equals(lessonName)) {
                System.out.println(array[i]);
            }


        }
    }

    public int getSize() {
        return size;
    }


    public Student getStudentByIndex(int index) {


        if (index < 0 || index >= size) {
            System.out.println("invalid index");
            return null;

        }
        return array[index];
    }


}



