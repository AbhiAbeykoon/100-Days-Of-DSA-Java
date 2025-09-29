public class day17 {

    public static void findsubarr(int[] arr, int value) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {

            int sum = arr[i];

            for (int x = i + 1; x < arr.length; x++) {
                sum += arr[x];

                if (sum == value) {
                    System.out.print("{");
                    for (int y = i; y <= x; y++) {
                        System.out.print(arr[y] + " ");
                    }
                    System.out.print("}");
                    found = true;
                }
            }
        }

        if (found == false) {
            System.out.print("Sub Array Not founded");
        }
    }

    public static void main(String[] args) {
        int[] my_array = { 1, 2, 3, 7, 5 };
        int key = 12;

        findsubarr(my_array, key);
    }
}
