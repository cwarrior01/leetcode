public class roughpractice {
public static void main (String []args){
factor (36);
    //    int i= 0 ;

//while(i<5) {
//    System.out.println(i);
//    }
}
static void factor (int n ){
    for ( int i  = 1; i<= Math.sqrt(n); i++ ){
        System.out.print(n/i + " ");
        System.out.println(n % i == 0);
    }

}

}
