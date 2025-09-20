import java.util.Scanner;

public class day13 {

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of elements in the Array");
        int array_size = scanner.nextInt();

        int[] my_array = new int[array_size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = scanner.nextInt();
        }

        return my_array;

    }

    public static int[] rotateArray(int[] arr, int value) {
        int[] my_array = new int[arr.length];
        int index = 0;

        for (int i = value; i <= arr.length; i++) {
            my_array[index] = arr[i];
            index++;
        }

        for (int x = 0; x < value; x++) {
            my_array[index] = arr[x];
            index++;
        }

        return my_array;
    }

    public static void printArray(int[] printarr) {
        for (int i = 0; i < printarr.length; i++) {
            System.out.print(printarr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = createArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Rotate");
        int rotate_size = scanner.nextInt();
        int[] rotateArray = rotateArray(arr, rotate_size);
        printArray(rotateArray);
    }

}
