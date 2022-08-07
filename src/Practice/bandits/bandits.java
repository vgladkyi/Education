package Practice.bandits;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bandits {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int a,b;
        ArrayList<Integer> number = new ArrayList<>(); // zadaem massiv
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\bandits\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while (st.hasMoreTokens()) {
            number.add(Integer.valueOf(st.nextToken()));
        }
        count--;
        for (Integer aNumber:number){
            count += aNumber;
        }
        a = count - number.get(0);
        b = count - number.get(1);
        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\bandits\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(a +" "+b));
        Answer.close();
    }
}

