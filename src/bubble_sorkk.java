import java.util.Arrays;
public class bubble_sorkk {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6,};
       bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length - i-1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
    }
}