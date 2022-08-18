package homework.student.storage;

import homework.student.exception.LessonNotFoundException;
import homework.student.model.Lesson;


public class LessonStorage {

    private Lesson[] array = new Lesson[10];
    private int size;

    public Lesson add(Lesson lesson) {
        if (size == array.length) {
            extendArray();

        }
        array[size++] = lesson;
        return lesson;
    }

    private void extendArray() {
        Lesson[] temp = new Lesson[array.length + 10];
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


    public int getSize() {
        return size;
    }


    public Lesson getLessonByIndex(int index) throws LessonNotFoundException {


        if (index < 0 || index >= size) {

           throw new LessonNotFoundException("Lesson with " + index + " does not exist");

        }
        return array[index];
    }


}



