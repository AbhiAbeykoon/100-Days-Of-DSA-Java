import java.util.Scanner;
import java.util.HashMap;

public class day08 {

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

        HashMap<Integer, Integer> sumPair = new HashMap<>();

        for (int x = 0; x < myArray.length; x++) {
            int targetNumber = target - myArray[x];

            if (!sumPair.containsKey(targetNumber)) {
                sumPair.put(myArray[x], x);
            } else {
                System.out.print("Pair Founded" + "" + "(" + myArray[x] + "" + "," + targetNumber + "" + ")");

                found = true;
            }

        }

        if (!found) {
            System.out.println("Pair not Founded");
        }
    }
}
