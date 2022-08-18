package classwork.fileExample.fileExample.ioExapmle.file;


import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "C:\\Users\\DELL\\IdeaProjects\\JavaCore1\\src\\classwork\\fileExample\\fileExample\\ioExapmle\\file\\testExample.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();

    }

    public static void write() throws IOException {

        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H e llo from JAVA \r\n");
            bw.write("Hello from JAVA line2!!!!!!!");

        }
    }

    public static void read() throws IOException {

        try (
                BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("\naCount = " + aCount);
        }
    }

}
