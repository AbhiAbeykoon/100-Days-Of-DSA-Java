import java.util.Scanner;
import java.util.HashMap;

public class day09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter The Elements In Array");
            myArray[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> uniquemap = new HashMap<>();

        for (int x = 0; x < myArray.length; x++) {
            if (uniquemap.containsKey(myArray[x])) {
                System.out.println("Duplicate Element is :" + "" + myArray[x]);
            } else {
                uniquemap.put(myArray[x], x);
            }
        }

    }
}
