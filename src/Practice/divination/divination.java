package Practice.divination;


//https://github.com/allicen/Java-1000/tree/master/divination

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class divination {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        String str;
        int s;
        int sum = 0;
        File file = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\divination\\input");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\divination\\output");
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            nums.add(Integer.valueOf(st.nextToken()));
        }
        s = nums.get(0);

        for (int i = 1; i <= s; i++) {
            if (nums.get(0) % i == 0) {
                nums3.add(i);
            }
        }

        for (int aNums:nums3) {
            sum = sum +aNums;
        }

        FileWriter fw = new FileWriter(file2);
        fw.write(String.valueOf(sum));
        fw.close();

    }

}
