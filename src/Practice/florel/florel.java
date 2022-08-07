package Practice.florel;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://github.com/allicen/Java-1000/tree/master/floret

public class florel {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> days = new ArrayList<>();
        ArrayList<Character> ls = new ArrayList<>();
        ls.add('G');
        ls.add('C');
        ls.add('V');
        String str;
        int s = 0;
        FileReader fr = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\florel\\input");
        Scanner sc = new Scanner(fr);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            days.add(Integer.valueOf(st.nextToken()));
        }
        s = days.get(0);
        for (int i=0;i<s;i++){
            ls.add(3,ls.get(1));
            ls.set(1,ls.get(2));
            ls.remove(2);
            ls.add(0,ls.get(1));
            ls.remove(2);
        }
        FileWriter fw = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\florel\\output");
        fw.write(String.valueOf(ls));
        fw.close();
    }
}
