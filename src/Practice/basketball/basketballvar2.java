package Practice.basketball;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class basketballvar2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> Nums = new ArrayList<>();
        ArrayList<String> line = new ArrayList<>();
        int a = 0, b = 0;
        String str, winner;
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\basketball\\input.txt");
        Scanner sc = new Scanner(fileInput);
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            line.add(str);
            System.out.println(line);
        }
        for (String i : line) {
            StringTokenizer st = new StringTokenizer(i, " ");
            while (st.hasMoreTokens()) {
                Nums.add(Integer.valueOf(st.nextToken()));
            }
        }
        System.out.println(Nums);
        for (int j = 0; j < Nums.size(); j++) { // Подсчет количества очков для каждой из команд
            if ((j + 1) % 2 == 1) {
                a += Nums.get(j);
            } else {
                b += Nums.get(j);
            }
        }
        winner = (a > b) ? "1" : // Какая команда победила
                (b > a) ? "2" : "DRAW";

        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\basketball\\output.txt");// Запись числа в файл
        Answer.write(winner);
        Answer.close();
    }
}