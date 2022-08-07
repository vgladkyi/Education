package JavaCourse.FirstLesson;

public class secondMain {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        try {
            System.out.println(arr[2]);
            int res = 100 / 1;
        } catch (ArithmeticException e) {
            System.out.println("error" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error" + e);
        } finally {
            System.out.print("srabotal finally");
        }
    }
}
