public class firstANdlastposition {
    public static void main(String[] args) {
int []arr = { 1,2,2,3,3,4,5,6,7,8,9,9,9};
int targe = 3 ;
int []result = search1(arr, targe);
        System.out.println(result[0]);
        System.out.println( result[1]);
    }
    static int [] search1(int[] arr, int target ){

        int [] ans = {-1, -1};
        int start = search( arr, target , true);
        int end = search(arr,target , false);
        ans [0]=start;
        ans [1]=end;
    return ans;
    }
    static int search(int[] arr, int target , boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
            if (findStartIndex){
                end = mid -1 ;
            }else {
                start = mid + 1 ;
            }
            }
        }
        return ans;

    }
}
//class Solution {
//    public int[] searchRange(int[] arr , int target) {
//
//        int[] ans = {-1, -1};
//        int start = search( arr, target , true);
//        int end = search(arr,target , false);
//        ans [0]=start;
//        ans [1]=end;
//    return ans;
//    }
//    static int search(int[] arr, int target , boolean findStartIndex) {
//        int ans = -1;
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//            if (findStartIndex){
//                end = mid -1 ;
//            }else {
//                start = mid + 1 ;
//            }
//            }
//        }
//        return ans;
//
//    }
//}