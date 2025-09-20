import java.util.ArrayList;
import java.util.Scanner;

public class day06 {

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
            int currentValue = myArray.get(x);

            for (int y = x + 1; y < array_size; y++) {

                if (currentValue == myArray.get(y)) {
                    myArray.remove(y);
                    array_size--;
                }

            }
        }

        int newArraySize = myArray.size();

        System.out.println("The Large Subarray is :");

        System.out.println("{");
        for (int x = 0; x < newArraySize; x++) {
            System.out.println(x);
        }
        System.out.println("}");

    }

}
