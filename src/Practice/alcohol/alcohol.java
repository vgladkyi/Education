package Practice.alcohol;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class alcohol {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String str;
        int eq;
        int min = 0, min1 = 0, min2 = 0, min3 = 0;
        File file = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\alcohol\\input");
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            nums.add(Integer.valueOf(st.nextToken()));
        }
        if (nums.get(0) >= 2 && nums.get(1) >= 6 && nums.get(2) >= 1) {
            min1 = nums.get(0) / 2;
            min2 = nums.get(1) / 6;
            min3 = nums.get(2);
        }
        min = min1 <= min2 && min1 <= min3 ? min1 :
                min2 <= min1 && min2 <= min3 ? min2 : min3;

        FileWriter fw = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\alcohol\\output");
        fw.write(String.valueOf(min));
        fw.close();
    }
}
