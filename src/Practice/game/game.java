package Practice.game;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class game {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> Nums = new ArrayList<>();
        String str;
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\game\\input.txt");
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            Nums.add(Integer.valueOf(st.nextToken()));
        }
        int dif = 9-Nums.get(0);
        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\game\\output.txt");// Запись числа в файл
        Answer.write(Nums.get(0)+"9"+String.valueOf(dif));
        Answer.close();
    }
}
