import java.util.Arrays;
import java.util.*;
public class finding_multiple_element_cycle_sort_on_index {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int []arr)
    {
        int i = 0 ;
        while (i<arr.length){
            int check = arr[i]-1;
            if(arr[i] != arr[check] ){
                swap (arr,i,check);
            }else {
                i++;
            }
        }
    List <Integer> ans = new ArrayList<>();
        for (int j = 0 ; j<arr.length ;j++){
            if ( arr[j]!= j+ 1){
               ans.add(j+1);
            }
        }

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

