public class prime_no {
    public static void main(String[] args) {
int a = 47 ;
for (int i = 1 ; i<=a ; i++) {
    System.out.println(i +" " + prime(i));

}}
static boolean prime ( int n ){
        if(n<=1){
            return false;

        }
        int c = 2;
        while (c*c <= n){
            if (n % c == 0 ){
                return false ;
            }
        c++;
        }
return true ;
    }
}
