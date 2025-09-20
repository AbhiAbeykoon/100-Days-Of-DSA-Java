import java.util.Scanner;

public class day11 {

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

    public static void findMinMax(int[] arr) {
        int[] myArray = arr;
        int max = myArray[0];
        int min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }

            if (min > myArray[i]) {
                min = myArray[i];
            }
        }

        System.out.println("Max Value :" + "" + max);
        System.out.println("Min Value :" + "" + min);

    }

    public static void main(String[] args) {

        int[] myArray = createArray();

        findMinMax(myArray);

    }
}
