package JavaCourse.FirstLesson;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FirstMain {
    public static void main(String[] args) {
        String[] names = new String[3];
        String[] surNames = new String[3];
        int[] ages = new int[]{50,21,18};

        makeArr(names);
        makeArr(surNames);
        makeArr(ages);


        printArr(names);
        printArr(surNames);
        printArr(ages);
        int result = summa(5,10);
        printArr(result);
        int result2 = summa(5,10,15);
        printArr(result2);
    }

    public static String[] makeArr(String[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++){
            System.out.println("input: "+(i+1)+" elem: ");
            arr[i]= sc.nextLine();
        }
        return arr;
    }

    public static int[] makeArr(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++){
            System.out.println("input: "+i+" elem: ");
            arr[i]= sc.nextInt();
        }
        return arr;
    }

    public static int summa(int a,int b){
        int res = a + b;
        return res;
    }

    public static int summa(int a,int b,int c){
        int res = a + b+ c ;
        return res;
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.println("ValuOfElement: " + s);
        }
    }

    public static void printArr(int[] arr) {
        for (Integer s : arr) {
            System.out.println("ValuOfElement: " + s);
        }
    }

    public static void printArr(int word) {
            System.out.println(word);
    }
}
