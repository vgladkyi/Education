package Practice.strawberry;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class strawberry {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> nums = new ArrayList<>();
        String str;
        int res;
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\strawberry\\input.txt");
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
                nums.add(Integer.valueOf(st.nextToken()));
        }
        res = (nums.get(0)+nums.get(1))-nums.get(2);
              if((nums.get(0)+nums.get(1))-nums.get(2)<0){
                FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\strawberry\\output.txt");
                Answer.write("Immposible");
                Answer.close();
            } else{
                FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\strawberry\\output.txt");
                Answer.write(String.valueOf(res));
                Answer.close();
            }
    }
}
