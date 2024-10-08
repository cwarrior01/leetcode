//import java.util.Arrays;
//public class binary2darray {
//    public static void main(String[] args) {
//        int [][] arr ={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        } ;
//        System.out.println(Arrays.toString(search(arr,6)));
//    }//
//    static int [] binarySearch(int [][] matrix , int row,int cstart, int cend,int target) {
//        while (cstart <= cend) {
//            int mid = cstart + (cend - cstart) / 2;
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                cstart = mid + 1;
//
//            } else {
//                cend = mid - 1;
//            }
//        }
//    return new int []{-1,-1};
//    }
//    static int [] search (int [][] matrix , int target ){
//        int rows = matrix.length-1;
//        int cols = matrix[0].length;
//
//        if (rows ==1){
//            return binarySearch(matrix , 0,0,cols-1,target);
//        }
//        // run the loop till two rows are reamning
//        int rstart = 0;
//        int rend = rows ;
//        int cmid= cols/2 ;
//
//        while(rstart < (rend -1)){
//       int mid = rstart + (rend - rstart )/2 ;
//       if (matrix[mid][cmid] == target ){
//           return new int [] {mid,cmid};
//       }
//        if (matrix[mid][cmid]< target){
//            rstart = mid ;
//        }else {
//        rend = mid ;
//        }
//        }
//      if (matrix[rstart][cmid]== target){
//          return new int []{rstart,cmid};
//      }
//if (matrix[rstart + 1] [cmid] == target){
//    return new int []{rstart +1, cmid};
//
//}
//// search in first half
//    if (target ==  matrix[rstart][cmid-1]){
//        return binarySearch(matrix,rstart,0,cmid-1,target);
//    }
//if (target >= matrix[rstart][cmid +1 ] && target <=matrix[rstart][cols-1]){
//    return binarySearch(matrix,rstart,cmid+1,cols-1,target);
//}
//        if (target <= matrix[rstart+1][cmid -1 ]){
//            return binarySearch(matrix,rstart+1,0,cmid-1,target);
//        }else{
//            return binarySearch(matrix,rstart+1,cmid+1,cols-1,target);
//        }
//
//    }
//}
import java.util.Arrays;

public class binary2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 6))); // Expected output: [1, 2]
    }

    static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        // If the matrix has only one row
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // Search for the correct row
        while (rstart < rend - 1) {
            int mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        // Check if the target is in one of the two potential rows
        if (matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // Search in the left and right sections
        if (target >= matrix[rstart][0] && target <= matrix[rstart][cmid - 1]) {
            return binarySearch(matrix, rstart, 0, cmid - 1, target);
        }
        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return binarySearch(matrix, rstart, cmid + 1, cols - 1, target);
        }
        if (target >= matrix[rstart + 1][0] && target <= matrix[rstart + 1][cmid - 1]) {
            return binarySearch(matrix, rstart + 1, 0, cmid - 1, target);
        }
        if (target >= matrix[rstart + 1][cmid + 1] && target <= matrix[rstart + 1][cols - 1]) {
            return binarySearch(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}
