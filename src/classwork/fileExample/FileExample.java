package classwork.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {
    static String filePath = "C:\\Users\\DELL\\IdeaProjects\\JavaCore1\\src\\classwork\\fileExample";
    static String newFilePath = "C:\\Users\\DELL\\IdeaProjects\\JavaCore1\\src\\classwork\\fileExample\\testFolder\\Hello3.txt";

    public static void main(String[] args) throws IOException {


        try {
            File myObj = new File(filePath);
            if (new File("Armank.txt").createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
//        boolean b = myFile.createNewFile(new File(newFilePath));
//        System.out.println(b);

//        long sum = 0;
//        for (File file : myFile.listFiles()) {
//            sum += file.length();
//
//
//        }System.out.println(sum/1024);
//        boolean b = myFile.renameTo(new File(newFilePath));
//        System.out.println(b);
//
//
//        System.out.println(myFile.exists());
//        if (!myFile.exists()) {
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("is file: " + myFile.isFile());
//        System.out.println("is directory: " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//
//            }

