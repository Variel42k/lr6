package lr6;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner inCMD = new Scanner(System.in);
        int n = inCMD.nextInt();
        System.out.print("Циклом: " + sumFact(n) + "\n");
        System.out.print("Рекурсией: " + sumFact2(n) + "\n");
        inCMD.close();
    }

    public static int sumFact(int n) {

        if(n%2==1) {
            for (int i = n-2; i >= 3; i -= 2) {
                n = n * i;
            }
        }else {
            for (int i = n-2; i >= 2; i -= 2) {
                n = n * i;
            }
        }

        return n;
    }

    public static int sumFact2(int n) {
        if (n < 3) {
            return n;
        }
        else {
            return n * sumFact2(n - 2);
        }
    }
}
