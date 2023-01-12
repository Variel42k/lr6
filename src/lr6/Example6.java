package lr6;

public class Example6 {
    public static void main(String[] args) {
        arr(new int[] { 6, 2, 5, 1, 9, 7, 6, 2, 1, 4, 6, 7, 2, 3, 6, 7, 1, 5, 9, 2, 4, 9, 3, 2 }, 6);
        arr(new int[] { 6, 2, 5, 1, 9, 7, 6, 2, 6, 7, 1, 5, 9, 2, 4, 9, 3, 2 }, 60);
    }

    public static int[] arr(int[] arr, int count) {

        if (count <= arr.length) {
            int[] arr_out = new int[count];
            for (int i = 0; i < count; i++) {
                arr_out[i] = arr[i];
                System.out.print(arr_out[i] + ", ");
            }
            System.out.print("\n");
            return arr_out;
        } else {
            int[] arr_out = new int[count];
            for (int i = 0; i < arr.length; i++) {
                arr_out[i] = arr[i];
                System.out.print(arr_out[i] + ", ");
            }
            System.out.print("\n");
            return arr_out;
        }
    }
}
