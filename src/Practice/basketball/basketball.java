package Practice.basketball;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class basketball {
    public static void main(String[] args) throws IOException {
        int aTeamScore,bTeamScore;
        ArrayList<Integer> Nums1 = new ArrayList<>();
        ArrayList<Integer> Nums2 = new ArrayList<>();
        ArrayList<Integer> Nums3 = new ArrayList<>();
        ArrayList<Integer> Nums4 = new ArrayList<>();
            String str,str2,str3,str4,res;
            FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\basketball\\input.txt");
            Scanner sc = new Scanner(fileInput);
            str = sc.nextLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                while (st.hasMoreTokens()) {
                    Nums1.add(Integer.valueOf(st.nextToken()));
                }
            str2 = sc.nextLine();
                 StringTokenizer st2 = new StringTokenizer(str, " ");
                 while (st2.hasMoreTokens()) {
                 Nums2.add(Integer.valueOf(st2.nextToken()));
                  }
            str3 = sc.nextLine();
                StringTokenizer st3 = new StringTokenizer(str, " ");
                while (st3.hasMoreTokens()) {
                    Nums3.add(Integer.valueOf(st3.nextToken()));
                }
            str4 = sc.nextLine();
            StringTokenizer st4 = new StringTokenizer(str, " ");
            while (st4.hasMoreTokens()) {
                Nums4.add(Integer.valueOf(st4.nextToken()));
            }
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
            aTeamScore=(Nums1.get(0)+Nums2.get(0)+Nums3.get(0)+Nums4.get(0));
            bTeamScore=(Nums1.get(1)+Nums2.get(1)+Nums3.get(1)+Nums4.get(1));
            res=aTeamScore>bTeamScore?"1":
                aTeamScore<bTeamScore?"2":"DRAW";

        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\basketball\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(res));
        Answer.close();

    }

}
