package Practice.arithmetic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class arithmetic {
    public static void main(String[] args) throws IOException {
    ArrayList<Integer> Nums = new ArrayList<>();
    String str;
    FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\arithmetic\\input.txt");
    Scanner sc = new Scanner(fileInput);
    str = sc.nextLine();
    StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
        Nums.add(Integer.valueOf(st.nextToken()));
    }
       String res = (Nums.get(0)*Nums.get(1)==Nums.get(2))?"yes":"no"; // вместо строк иф если одно условие
    FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\arithmetic\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(res));
        Answer.close();
}
}
