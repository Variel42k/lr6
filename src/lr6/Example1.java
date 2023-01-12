package lr6;

public class Example1 {
    public static void main(String[] args) {
        new input1();
        input1.getData();
        new input1(12);
        input1.getData();
        new input1('v');
        input1.getData();
        new input1(new char[] { 't', 's', 'a', 'e', 'b' });
        input1.getData();
        new input1("word");
        input1.getData();
    }
}

@SuppressWarnings("static-access")
class input1 {
    input1() {
        setData();
    }

    input1(int arg) {
        setData(arg);
    }

    input1(char arg) {
        setData(arg);
    }

    input1(char[] arg) {
        setData(arg);
    }

    input1(String arg) {
        setData(arg);
    }

    private static int f_numeric;
    private static String f_text;

    void setData() {
        this.f_text = "1";
        this.f_numeric = 2;
    }

    void setData(int arg) {
        this.f_numeric = arg;
    }

    void setData(char arg) {
        this.f_text = Character.toString(arg);
    }

    void setData(char[] arg) {
        this.f_text = String.copyValueOf(arg);
    }

    void setData(String arg) {
        this.f_text = arg;
    }

    public static void getData() {
        System.out.print("Числовое = " + f_numeric + ", " + "Текстовое = " + f_text + "\n");
    }
}
