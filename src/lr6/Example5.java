package lr6;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner inCMD = new Scanner(System.in);
        int n = inCMD.nextInt();
        System.out.println(sumSqrt(n));
        System.out.println(sumSqrt2(n));
        inCMD.close();
    }

    public static int sumSqrt(int n) {
        int Sqrt = 0;
        for (int i = 1; i <= n; i++) {
            Sqrt = Sqrt + i * i;
        }
        return Sqrt;
    }

    public static int sumSqrt2(int n) {
        if (n <= 1) {
            return n;
        } else {
            return sumSqrt2(n - 1) + n * n;
        }
    }
}
