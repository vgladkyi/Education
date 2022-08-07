package Practice.Gulliver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Gulliver {
    public static void main(String[] args) throws IOException {
        int qt;
        ArrayList<Integer> number = new ArrayList<>(); // zadaem massiv
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\Gulliver\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while (st.hasMoreTokens()) {
            number.add(Integer.valueOf(st.nextToken()));
        }
        qt = number.get(0)*number.get(0)*number.get(1);
        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\Gulliver\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(qt));
        Answer.close();
    }
}
