import java.util.Arrays;
public class bubble_sorkk {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6,};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap =  true;
                }

            }
            if (swap == false){
                break;
            }
        }
    }
}