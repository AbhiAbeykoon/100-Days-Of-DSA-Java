import java.util.Scanner;

public class day05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number of elements in array");
        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter The element of array");
            myArray[i] = scanner.nextInt();

        }

        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }

        System.out.print("(");

        int x = 0;
        while (x < zeroCount) {
            System.out.print(0);
            zeroCount--;
        }

        int y = 0;
        while (y < oneCount) {
            System.out.print(1);
            oneCount--;
        }

        System.out.print(")");

    }

}

