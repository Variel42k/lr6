package lr6;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        arr(18, 74, 88, 30, 52, 57, 7, 20, 32, 54, 90, 58, 35);
    }

    static int[] arr(int ... is) {
        Arrays.sort(is);

        int[] out = new int[] {is[0],is[is.length-1]};
        System.out.printf("max: %d, min: %d", out[1],out[0]);
        return out;
    }
}
