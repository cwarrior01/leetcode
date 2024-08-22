import java.util.Arrays;

public class selection_sortkk {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmaxindex( arr, 0, last );
swap(arr,maxindex,last);
            }

    }
static void swap (int []arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
}


    static int getmaxindex(int[] arr, int start, int end) {
    int max = start;
    for (int  i = start;i<=end;i++){
        if (arr[max] < arr[i] ){
            max = i ;
        }
    }
   return max ;
    }
}