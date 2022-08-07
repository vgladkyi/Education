package Practice.AplusB;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Aplusb {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numeric = new ArrayList<>(); // zadaem massiv
        int s = 0;  // vvodim peremennie
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\AplusB\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); //vvodim razdelitel v vide probela
        while(st.hasMoreTokens()){
            int a = Integer.valueOf(st.nextToken());
            numeric.add(a); //poluchaem massiv iz file
        }
        for (Integer aNumeric : numeric) {
            s = s + aNumeric; //aNumeric - eto perebiraem massiv, a s = eto summa kajdogo chisla posle probela
        }
    FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\AplusB\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(s));
        Answer.close();


    }
}
