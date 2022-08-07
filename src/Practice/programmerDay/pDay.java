package Practice.programmerDay;

//https://github.com/allicen/Java-1000/tree/master/programmer_day

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class pDay {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> nums = new ArrayList<>();
        String str;
        File file1 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\programmerDay\\input");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\programmerDay\\output");
        FileReader fr = new FileReader(file1);
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
            nums.add(Integer.valueOf(st.nextToken()));
        }


    }
}
