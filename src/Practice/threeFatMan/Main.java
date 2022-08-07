package Practice.threeFatMan;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String str,f;
        int min = 94, max = 727,fatest=0;
        File file1 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\threeFatMan\\input.txt");
        File file2 = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\threeFatMan\\output.txt");
        FileReader fileInput = new FileReader(file1);
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            nums.add(Integer.valueOf(st.nextToken()));
        }
        for (int i=0; i < str.length(); i++) {
            if (nums.get(0) < min) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } else if (nums.get(1) < min) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } else if (nums.get(2) < min) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } else if (nums.get(0) > max) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } else if (nums.get(1) > max) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } else if (nums.get(2) > max) {
                FileWriter answer = new FileWriter(file2);
                f = "ERROR";
                answer.write(String.valueOf(f));
                answer.close();
                break;
            } if (nums.get(0) > nums.get(1) && nums.get(0) > nums.get(2)) {
                fatest = nums.get(0);
                FileWriter answer = new FileWriter(file2);
                answer.write(String.valueOf(fatest));
                answer.close();
                break;
            } else if (nums.get(1) > nums.get(0) && nums.get(1) > nums.get(2))
                fatest = nums.get(1);
                FileWriter answer = new FileWriter(file2);
                answer.write(String.valueOf(fatest));
                answer.close();
                break;
            }if (nums.get(2)>nums.get(0)&&nums.get(2)>nums.get(1)){
                fatest = nums.get(2);
                FileWriter answer = new FileWriter(file2);
                answer.write(String.valueOf(fatest));
                answer.close();
        }
    }
}
