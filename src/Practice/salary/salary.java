package Practice.salary;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class salary {
    public static void main(String[] args) throws IOException{
        int a,b,c,dif;
        int min = 0;
        int max = 0;
        ArrayList<Integer> Nums = new ArrayList<>();
        String str;
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\salary\\input.txt");
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            Nums.add(Integer.valueOf(st.nextToken()));
        }
        a = Nums.get(0);
        b = Nums.get(1);
        c = Nums.get(2);

        for (int aNums: Nums){
            if (a < b && a<c) {
                min = Nums.get(0);
            }else if (b < c && b < a){
                min = Nums.get(1);
            } else if (c < a && c < b){
                min=Nums.get(2);
            }
        }
        for (int aNums:Nums) {
            if (a > b && a > c) {
                max = Nums.get(0);
            } else if (b > c && b > a) {
                max = Nums.get(1);
            } else if (c > a && c > b){
                max = Nums.get(2);
            }
        }
        dif = max-min;
        FileWriter Answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\salary\\output.txt");// Запись числа в файл
        Answer.write(String.valueOf(dif));
        Answer.close();
    }

}
