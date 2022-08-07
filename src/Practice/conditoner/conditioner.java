package Practice.conditoner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class conditioner {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String str,str2;
        File file1 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\conditoner\\input");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\conditoner\\output");
        FileReader fr = new FileReader(file1);
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        while (st.hasMoreTokens()){
            nums.add(Integer.valueOf(st.nextToken()));
        }
        str2 = sc.nextLine();

        if (str2.equals("freeze")&&nums.get(1)>nums.get(0)){
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(nums.get(0)));
            fw.close();
        }else if(str2.equals("heat")&&nums.get(1)>nums.get(0)){
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(nums.get(1)));
            fw.close();
        }else if ((str2.equals("auto"))){
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(nums.get(1)));
            fw.close();
        }else if(str2.equals("fan")){
            FileWriter fw = new FileWriter(file2);
            fw.write(String.valueOf(nums.get(0)));
            fw.close();
        }
    }
}
