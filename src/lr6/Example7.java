package lr6;

public class Example7 {
    public static void main(String[] args) {
        arr(new char[] { 'a', 'b', 'g', 'c', 'j', 'e', 'd', 'z', 'c', 'k', 'q', 'b', 'p' });
    }

    static int[] arr(char[] arr) {
        int[] arr_out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_out[i] = (int) arr[i];
            System.out.print(arr[i]+ " -> " + arr_out[i] + ", ");
        }
        return arr_out;
    }
}
