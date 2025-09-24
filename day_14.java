import java.util.Scanner;

public class day14 {

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

    public static int[] moveZero(int[] arr) {

        int index = 0;
        int pointer = 0;

        while (index < arr.length) {
            if (arr[index] != 0) {
                arr[pointer] = arr[index];
                pointer++;
            }
            index++;
        }

        while (pointer < arr.length) {
            arr[pointer] = 0;
            pointer++;

        }
        return arr;
    }

    public static void printArray(int[] printarr) {
        for (int i = 0; i < printarr.length; i++) {
            System.out.print(printarr[i] + "" + ",");
        }
    }

    public static void main(String[] args) {
        int[] my_array = createArray();
        int[] movedArray = moveZero(my_array);
        printArray(movedArray);
    }

}
