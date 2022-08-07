package JavaCourse.FirstLesson;

//Создайте двумерный массив, в котором найдите минимальный элемент среди всех элементов массива. Важно учесть, что нахождение минимального массива должен производиться при помощи циклов. Массив:
//int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };


import java.io.IOException;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        int[][] arr = new int[][] { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
        int min1 = 0, min2 = 0, min3 = 0, min = 0;
        nums1.add(arr[0][0]);
        nums1.add(arr[0][1]);
        nums1.add(arr[0][2]);
        nums2.add(arr[1][0]);
        nums2.add(arr[1][1]);
        nums2.add(arr[1][2]);
        nums3.add(arr[2][0]);
        nums3.add(arr[2][1]);
        nums3.add(arr[2][2]);

        for (int i =0; i<nums1.toArray().length;i++){
            if (nums1.get(0)<nums1.get(1)&&nums1.get(0)<nums1.get(2)){
                min1=nums1.get(0);
            }else if (nums1.get(1)<nums1.get(0)&&nums1.get(1)<nums1.get(2)){
                min1=nums1.get(1);
            }else{
                min1=nums1.get(2);
            }
        }

        for (int i =0; i<nums2.toArray().length;i++){
            if (nums2.get(0)<nums2.get(1)&&nums2.get(0)<nums2.get(2)){
                min2=nums2.get(0);
            }else if (nums2.get(1)<nums2.get(0)&&nums2.get(1)<nums2.get(2)){
                min2=nums2.get(1);
            } else {
                min2=nums2.get(2);
            }

        }

        for (int i =0; i<nums3.toArray().length;i++) {
            if (nums3.get(0) < nums3.get(1) && nums3.get(0) < nums3.get(2)) {
                min3 = nums3.get(0);
            } else if (nums3.get(1) < nums3.get(0) && nums3.get(1) < nums3.get(2)) {
                min3 = nums3.get(1);
            } else {
                min3 = nums3.get(2);
            }
        }
        min = min1<min2&&min1<min3?min1:
                min2<min1&&min2<min3?min2:min3;

        System.out.println(min);

    }
}
