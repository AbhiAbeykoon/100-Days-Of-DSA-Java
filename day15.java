import java.util.Scanner;

public class day15 {

    public static void findValue(int[] arr, int num) {
        int correctsum = num * (num + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Missing Value is" + " " + (correctsum - sum));
    }

    public static void main(String[] args) {
        int n = 5;
        int[] my_arrya = { 1, 2, 4, 5 };
        findValue(my_arrya, n);
    }

}
