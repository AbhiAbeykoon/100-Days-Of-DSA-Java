import java.util.Scanner;

public class day10 {
    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter The Elements In Array");
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }

    public static void sortArray(int[] arr) {
        int[] myArray = arr;
        int low = 0;
        int mid = 0;
        int high = myArray.length - 1;

        while (mid <= high) {
            if (0 == myArray[mid]) {
                int tempValue = myArray[low];
                myArray[low] = myArray[mid];
                myArray[mid] = tempValue;
                mid++;
                low++;
            } else if (1 == myArray[mid]) {
                mid++;
            } else {
                int tempHighValue = myArray[mid];
                myArray[mid] = myArray[high];
                myArray[high] = tempHighValue;
                high--;
            }
        }
        for (int x = 0; x < myArray.length; x++) {
            System.out.print(myArray[x] + "" + "," + "");
        }
    }

    public static void main(String[] args) {
        int[] myArray = createArray();

        sortArray(myArray);
    }
}
