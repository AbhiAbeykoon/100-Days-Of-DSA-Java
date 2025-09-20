import java.util.Scanner;

public class day03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter The element of array");
            myArray[i] = scanner.nextInt();

        }

        System.out.println("Enter The target value");

        int target = scanner.nextInt();

        for (int x = 0; x < myArray.length; x++) {
            int current_value = myArray[x];
            for (int y = x + 1; y < myArray.length; y++) {
                int sum = current_value + myArray[y];
                if (target == sum) {
                    System.out.println("Pair Found" + "(" + current_value + "," + myArray[y] + ")");
                    found = true;

                }

            }

        }

        if (found != true) {
            System.out.println("Pair Not Founded");
        }

    }

}
