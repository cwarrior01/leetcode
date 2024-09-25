public class digits_recursion {
     public static void main (String [] args ){
         int ans = digitrecursion1(1342);
          System.out.println(ans);
     }
//static int digitrecursion(int n ){
//          if (n==0){
//               return 0;
//          }
//return (n%10) +  digitrecursion(n/10);

//}
static int digitrecursion1(int n ){
          if (n%10==n){
               return n;

          }
return (n%10) * digitrecursion1(n/10);
     }
}
