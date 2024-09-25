//public class countIn_recrsion {
//    public static void main(String[] args) {
//        System.out.println(count(200015140));
//    }
//static int count (int n ) {
//   return helper (n,0);
//
//}
//
//    private static int helper(int n, int c) {
//if (n==0){
//    return c ;
//}
//  int rem  = n % 10 ;
//   if (rem == 0){
//      return helper(n/10,c+1);
//   }
//    return helper (n/10,c);
//    }
//}
public class countIn_recrsion {
    public static void main(String[] args) {
//        System.out.println(count(200015140,0));
//    }
//    static int count (int n ,int c) {
//        int result = helper(n,0);
//        return result;
//
//    }
//
//    private static int helper(int n, int c) {
//        if (n==0){
//            return c ;
//        }
//        int rem  = n % 10 ;
//        if (rem == 0){
//            return helper(n/10,c+1);
//        }
//        return helper (n/10,c);
//}
//}
        System.out.println(helper(200015140,0));
    }

    private static int helper(int n, int c) {
        if (n==0){
            return c ;
        }
        int rem  = n % 10 ;
        if (rem == 0){
            return helper(n/10,c+1);
        }
        return helper (n/10,c);
}
}