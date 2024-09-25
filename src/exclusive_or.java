public class exclusive_or {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 3, 2, 1, 5};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
        unique ^= n;
        }
    return unique;
    }
}