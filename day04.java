import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter The element of array");
            myArray[i] = scanner.nextInt();

        }

        for (int x = 0; x < myArray.length; x++) {
            int currentValue = myArray[x];

            for (int y = x + 1; y < myArray.length; y++) {

                if (currentValue == myArray[y]) {
                    System.out.println("Duplicate Value is :" + myArray[x]);
                    break;
                }
            }
        }

    }

}
