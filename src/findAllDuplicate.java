import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class findAllDuplicate {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        // Corrected while loop
        while (i < arr.length) {
            int check = arr[i] - 1;
            if (arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            // Check for duplicates
            if (arr[j] != j + 1) {
                list.add(arr[j]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
