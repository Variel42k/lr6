package lr6;

public class Example9 {
    public static void main(String[] args) {
        arr(new char[] { 'a', 'b', 'g', 'c', 'j', 'e', 'd', 'z', 'c', 'k', 'q', 'b', 'p' });
    }

    static void arr(char[] arr) {
        String str = new String(arr);
        System.out.print("Дано:	   ");
        outBuilder(arr);
        str = new StringBuilder(str).reverse().toString();
        arr = str.toCharArray();
        System.out.print("Результат: ");
        outBuilder(arr);
    }

    static void outBuilder(char[] arr) {

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
    }
}
