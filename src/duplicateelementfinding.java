import java.util.Arrays;

public class duplicateelementfinding {
    public int findDuplicate(int[] arr) {


        int i = 0 ;
        while (i<arr.length) {
            if (arr[i] != i + 1) {


                int check = arr[i] - 1;
                if (arr[i] != arr[check]) {
                    swap(arr, i, check);
                } else  {
                    return arr[i];
                }
                }else{
                i++;
            }
        }
    return -1;
    }
    static void swap (int []arr, int first,int second ){
//        int temp = arr[first];
//    arr[first] = arr[second];
//         arr[second] = temp;
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
    }
