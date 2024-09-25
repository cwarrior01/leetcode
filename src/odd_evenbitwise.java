public class odd_evenbitwise {
    public static void main(String[] args) {
        int n = 34 ;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n&1) == 1;
    }

}
