package Practice.eniya;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Eniya {
    public static void main(String[] args) throws IOException {
        int weight;
        ArrayList<Integer> number = new ArrayList<>(); // zadaem massiv
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\eniya\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while (st.hasMoreTokens()) {
            number.add(Integer.valueOf(st.nextToken()));
        }
            weight = number.get(1)*number.get(2)*2*number.get(0);
            FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\eniya\\output.txt");// Запись числа в файл
            Answer.write(String.valueOf(weight));
            Answer.close();
        }
}
