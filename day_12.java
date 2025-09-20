import java.util.Scanner;

public class day_12 {

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of elements in the Array");
        int array_size = scanner.nextInt();

        int[] my_array = new int[array_size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = scanner.nextInt();
        }

        return my_array;
    }

    
     public static void reverseArray(int[] arr){
     int[] my_array = arr;
     System.out.print("{");
     for(int i = my_array.length-1;i>=0;i--){
     System.out.print(my_array[i] +"");
     }
     System.out.print("}");
      }
     

    public static void main(String[] args) {
        int[] my_array = createArray();

        int[] reverseArray = reverseArray(my_array);

        printArray(reverseArray);

    }
}

