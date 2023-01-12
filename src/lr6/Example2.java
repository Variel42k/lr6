package lr6;

public class Example2 {
    private static int f_1 = 0;

    public static void main(String[] args) {
        out();
        setF_1();
        out();
    }

    static void out() {
        System.out.print("Значение поля:" + f_1 + "\n");
    }

    public static int getF_1() {
        return f_1;
    }

    public static void setF_1() {
        Example2.f_1++;
    }
}
