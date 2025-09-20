import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Elements in Array");

        int array_size = scanner.nextInt();

        int[] myArray = new int[array_size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.println("Enter the Value of Array");
            myArray[i] = scanner.nextInt();

        }

        float sum = 0;
        float avarage = 0;
        int numberOfElemets = 0;

        for (int x = 0; x < myArray.length; x++) {
            sum += myArray[x];
            numberOfElemets++;
        }

        avarage = sum / numberOfElemets;

        System.out.println("Sum of Array Values is :" + sum);
        System.out.println("Number Of elements of Array:" + numberOfElemets);
        System.out.println("Avarage of Array Values is :" + avarage);

    }
}
