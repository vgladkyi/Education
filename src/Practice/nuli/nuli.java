package Practice.nuli;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.StringTokenizer;

public class nuli {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\nuli\\input.txt");
        String str;
        try (FileReader fileInput = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fileInput.read(chars);
            str = new String(chars);
        }
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(i)) {
                i = max;
                i++;
            }
            System.out.println(max);
        }
    }
}