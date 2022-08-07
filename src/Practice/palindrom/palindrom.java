package Practice.palindrom;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) throws IOException {
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<String> numsReverse = new ArrayList<>();
        String str,eq;
        File file = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\palindrom\\input");
        FileReader fileInput = new FileReader(file);
        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (char aChars:chars){
                nums.add(String.valueOf(aChars));
        }
        for(int j = chars.length; j >0; j--){ // Записать в коллекцию в обратном порядке
            numsReverse.add(String.valueOf(chars[j-1]));
        }

        eq = (nums.equals(numsReverse)) ? "YES" : "NO";

        FileWriter res = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\palindrom\\output");
        res.write(String.valueOf(eq));
        res.close();


    }
}
