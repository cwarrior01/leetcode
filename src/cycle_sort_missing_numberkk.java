import java.util.Arrays;

class cycle_sort_missing_numberkk {
    static void missingNumber(int[] nums) {
        int[] arr = {1, 3, 4, 2, 5, 6,};
        missingnumber(arr);
        System.out.println(Arrays.toString(arr));
    }
static int missingnumber(int []arr){
        int i = 0;
        while (i < arr.length ){
            int correct =  arr[i] ;
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap (arr,i,correct);}
                else {
                    i++;

                }
            }

for ( int j= 0 ; j<arr.length ;j++){
if (arr[j] !=  j){
    return j ;
}
}
return arr.length;
    }
static void swap ( int []arr , int first , int second ){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }


}