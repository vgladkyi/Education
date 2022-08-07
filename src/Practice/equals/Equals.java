package Practice.equals;

import java.io.*;
import java.util.*;

public class Equals {
    public static void main(String[] args) throws IOException {
        String symbol;
        ArrayList<Integer> number = new ArrayList<>(); // zadaem massiv
        String str; // vvodim peremennie
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\equals\\input.txt"); // poluchaem chisla
        Scanner sc = new Scanner(fileInput);
        while (sc.hasNextLine()){
            str = sc.nextLine();
            number.add(Integer.valueOf(str));
        }
        symbol = (number.get(0)>number.get(1)) ? ">" : //proverka uslivya
                (number.get(0)<number.get(1)) ? "<" : "=";
        FileWriter fileOut = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\equals\\output.txt");
        fileOut.write(symbol);
        fileOut.close();
    }

}
