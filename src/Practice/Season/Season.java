package Practice.Season;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Season {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> nums = new ArrayList<>();
        String str,s;
        File file1 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\Season\\input.txt");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\Season\\output.txt");
        FileReader fileInput = new FileReader(file1);
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while (st.hasMoreTokens()){
            nums.add(Integer.valueOf(st.nextToken()));
        }
        s = (nums.get(0)>=3&&nums.get(0)<=5)?"Spring":
                (nums.get(0)>=6&&nums.get(0)<=8)?"Summer":
                        (nums.get(0)>=9&&nums.get(0)<=11)?"Fall":
                                (nums.get(0)>12)?"Error":"Winter";
        FileWriter answer = new FileWriter(file2);
        answer.write(String.valueOf(s));
        answer.close();

    }
}
