package bookexample.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Write 'Stop' dor finish");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("Stop")) {
                break;
            }
        }
        System.out.println("\n Content of your file:");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("Stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
