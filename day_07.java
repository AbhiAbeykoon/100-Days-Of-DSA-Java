import java.util.ArrayList;
import java.util.Scanner;

public class day07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        ArrayList<Integer> myArray = new ArrayList<>(array_size);

        for (int x = 0; x < array_size; x++) {
            System.out.println("Enter The elements of array");
            myArray.add(scanner.nextInt());

        }

        for (int x = 0; x < array_size; x++) {
            if (myArray.get(x) == 0) {
                myArray.set(x, -1);
            }
        }

        ArrayList<Integer> prefixSumArray = new ArrayList<>();
        int prefixSum = 0;

        for (int x = 0; x < array_size; x++) {
            prefixSum += myArray.get(x);
            prefixSumArray.add(prefixSum);
        }

        int maxlength = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int x = 0; x < array_size; x++) {
            for (int y = x + 1; y < array_size; y++) {
                if (prefixSumArray.get(x) == prefixSumArray.get(y)) {
                    int length = y - x;
                    if (length > maxlength) {
                        maxlength = length;
                        startIndex = x + 1;
                        endIndex = y;
                    }
                }
            }
        }

        System.out.println("Largest subarray is");
        System.out.println("{");

        for (int x = startIndex; x <= endIndex; x++) {
            if (myArray.get(x) == -1) {
                myArray.set(x, 0);
            }

            System.out.println(myArray.get(x));
        }

        System.out.println("}");

    }
}
