package Practice.luckyTicket;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//https://github.com/allicen/Java-1000/tree/master/conditioner


public class lucky {
    public static void main(String[] args) throws IOException {
        ArrayList<String> nums = new ArrayList<>();
        String str,res;
        File file1 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\luckyTicket\\input");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\luckyTicket\\output");
        FileReader fr = new FileReader(file1);
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (char aChars:chars) {
            nums.add(String.valueOf(aChars));
        }
        if (chars[0]+chars[1]+chars[2]==chars[3]+chars[4]+chars[5]) {
            res = "yes";
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(res));
            fw.close();
        } else{
            res = "no";
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(res));
            fw.close();
        }
    }
}
