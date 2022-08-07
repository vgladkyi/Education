package JavaCourse.FirstLesson;

//Напишите программу на Java, которая будет подсчитывать общую сумму чисел от 0 до 1000. Суммировать необходимо лишь те числа, которые кратны 3 или 5.

import java.io.IOException;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        int s = 0;
        int p = 0;
        while (p <= 1000) {
            if (p % 3 == 0 || p % 5 == 0 ) {
                nums.add(p);
            }
            p++;
        }

        for (Integer aNums : nums) {
                s += aNums;
        }

        System.out.println("Summa chisel kratnih 3 i 5: " +s);

    }
}