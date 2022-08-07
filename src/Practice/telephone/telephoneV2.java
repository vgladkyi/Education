package Practice.telephone;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
/*Услуги телефонной сети оплачиваются по следующему правилу: за разговоры до А минут в месяц – В рублей за минуту,
а разговоры сверх установленной нормы оплачиваются из расчета С рублей за минуту. Требуется написать программу,
вычисляющую плату за пользование телефоном для разговоров продолжительностью Т минут в месяц.
Формат ввода
Входной файл input.txt содержит натуральные числа A, B, C и T, не превышающие 1000. Числа располагаются в одной строке и разделены пробелами.
*/
public class telephoneV2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String str;
        FileReader fileInput = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\telephone\\input.txt");
        Scanner sc = new Scanner(fileInput);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()){
            nums.add(Integer.valueOf(st.nextToken()));
        }
        int res = (nums.get(3)>=nums.get(0))?(((nums.get(3)-nums.get(0))*nums.get(2))+(nums.get(1)*nums.get(0))):nums.get(1)*nums.get(3);
        FileWriter answer = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\telephone\\output.txt");
        answer.write(String.valueOf(res));
        answer.close();
    }
}
