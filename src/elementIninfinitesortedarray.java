public class elementIninfinitesortedarray {
    public static void main(String[] args) {
int [] arr = {1,2,4,5,6,7,8,9 };
int target = 4;
int result = search(arr,target);
        System.out.println(result);
    }
static int search(int arr [],int target ){
         int start = 0;
          int end = 1;
         while (target > arr[end]){
             int startnew = end+1;
        end = end + (end - start +1 )*2 ;
            start = startnew ;

         }
return binary(arr ,target ,start,end);
}

    static int binary(int arr[],int target ,int start ,int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr [mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
    return -1;
    }
}