package Practice.nuts;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class nuts {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>(); // zadaem massiv
        int s = 0;
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\nuts\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while (st.hasMoreTokens()) {
            int a = Integer.valueOf(st.nextToken());
            numbers.add(a); //poluchaem massiv iz file
            int b = Integer.valueOf(st.nextToken());
            numbers.add(b);
            int c = Integer.valueOf(st.nextToken());
            numbers.add(c);
            int res = a * b;
            if (res >= c) {
                FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\nuts\\output.txt");// Запись числа в файл
                Answer.write("yes");
                Answer.close();
            } else {
                FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\nuts\\output.txt");// Запись числа в файл
                Answer.write("no");
                Answer.close();
            }
        }
    }
}