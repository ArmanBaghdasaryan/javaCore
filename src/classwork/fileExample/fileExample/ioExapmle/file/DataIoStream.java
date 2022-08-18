package classwork.fileExample.fileExample.ioExapmle.file;

import java.io.*;

public class DataIoStream {
    private static final String FILE_PATH = "C:\\Users\\DELL\\IdeaProjects\\JavaCore1\\src\\classwork\\fileExample\\fileExample\\ioExapmle\\file\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(33);
        out.writeBoolean(false);
        out.close();
    }

    public static void read() throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(input.readInt());
        System.out.println(input.readBoolean());
    }


}
