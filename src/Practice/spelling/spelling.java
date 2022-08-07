package Practice.spelling;

//https://github.com/allicen/Java-1000/tree/master/spelling

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class spelling {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> dataOut = new ArrayList<>();
        int firstNumber;
        StringBuilder result = null;
        String str;
        FileReader file = new FileReader("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\spelling\\input");
        Scanner sc = new Scanner(file);
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            data.add(st.nextToken());

        }
        String line = data.get(1); // Разбираем второй элемент коллекции посимвольно
        char[] ch = line.toCharArray(); // Записывавем символы в массив
        data.remove(1); // Удаляем второй элемент коллекции
        for (char aCh : ch) { // Перебрать массив по символам
            data.add(String.valueOf(aCh));
        }

        firstNumber = Integer.valueOf(data.get(0)); // Какая буква лишняя в слове
        for (int i = 0; i < data.size(); i++) {
            if (i != 0 && firstNumber != i) { // Выкинуть лишние символы из строки
                dataOut.add(data.get(i));
            }
        }
        if (!dataOut.isEmpty()) {
            for (String lines : dataOut) {
                if (result != null) {
                    result.append(lines); // Добавить следующие элементы коллекции в строку
                } else {
                    result = new StringBuilder(lines); // Добавить первый элемент коллекции в строку
                }
            }
        } else {
            result = new StringBuilder("");
        }
        FileWriter fileOut = new FileWriter("C:\\Users\\Azrael\\IdeaProjects\\Education\\src\\Practice\\spelling\\output");
        fileOut.write(String.valueOf(result));
        fileOut.close();
    }
}

