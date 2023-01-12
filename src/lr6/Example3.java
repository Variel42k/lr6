package lr6;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        max(72, 51, 55, 24, 37, 33, 54, 74, 4, 25, 45);
        min(72, 51, 55, 37, 33, 54, 74, 4, 25, 45);
        mid(72, 51, 55, 24, 37, 33, 54, 25, 45);
    }

    public static void max(int ... is) {
        Arrays.sort(is);
        System.out.print(is[is.length-1] + "\n");
    }

    public static void min(int ... is) {
        Arrays.sort(is);
        System.out.print(is[0] + "\n");
    }

    public static void mid(int ... is) {
        Arrays.sort(is);
        System.out.print(is[is.length/2] + "\n");
    }
}
