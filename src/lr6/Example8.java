package lr6;

public class Example8 {
    public static void main(String[] args) {
        arr(new int[] { 6, 2, 5, 1, 9, 7, 6, 2, 1, 4, 6, 7, 2, 3, 6, 7, 1, 5, 9, 2, 4, 9, 3, 2 });
    }

    static int arr(int[] arr) {
        int sum=0;
        int mid;
        for(int i = 0; i<arr.length; i++) {
            sum+=arr[i];
        }
        mid=sum/arr.length;
        System.out.printf("Сумма: %d \n", sum);
        System.out.printf("Кол во элементов: %d \n", arr.length);
        System.out.printf("Ср.знач: %d \n", mid);
        return mid;
    }
}
