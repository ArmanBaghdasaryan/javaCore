package classwork.fileExample.fileExample.ioExapmle.serialization.file;

import java.io.*;

public class SerializationDemo {
    private static final String FILE_PATH = "C:\\Users\\DELL\\IdeaProjects\\JavaCore1\\src\\classwork\\fileExample\\fileExample\\ioExapmle\\serialization\\file\\studentExample.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Arman", "Baghdasaryan", 24, "Arman@mail.ru");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student1 = (Student) object;
        System.out.println(student1);


    }

}
