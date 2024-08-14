public class findInMountainArray {
    public void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int target = 4;
        int ans = eak(target, arr);
        System.out.println(ans);
    }

    static int eak(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                target = mid;
            }
        }
        return target;
    }
}