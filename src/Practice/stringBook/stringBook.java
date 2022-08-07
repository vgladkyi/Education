package Practice.stringBook;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class stringBook {
       public static void main(String[] args) throws IOException {
        ArrayList<Integer> ar = new ArrayList();
        int pageNum,stringNum;
        File fi = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\stringBook\\input");
        File fw = new File("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\stringBook\\output");
        FileReader fr = new FileReader(fi);
        Scanner sc = new Scanner(fr);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        while(st.hasMoreTokens()) {
            ar.add(Integer.valueOf(st.nextToken()));
        }


        if (ar.get(1) > ar.get(0) && ar.get(1) % ar.get(0) != 0) {
            stringNum = ar.get(1) % ar.get(0);
            pageNum = ar.get(1) / ar.get(0) + 1;
        } else if (ar.get(1) > ar.get(0) && ar.get(1) % ar.get(0) == 0) {
            stringNum = ar.get(0);
            pageNum = ar.get(1) / ar.get(0);
        } else if (ar.get(0) > ar.get(1)) {
            stringNum = ar.get(1);
            pageNum = ar.get(1) / ar.get(0) + 1;
        } else {
            stringNum = ar.get(1) / ar.get(0);
            pageNum = ar.get(1) / ar.get(0) + 1;
        }

        String res = "" + pageNum + " " + stringNum;
        FileWriter fwr = new FileWriter(fw);
        fwr.write(res);
        fwr.close();
    }
}
