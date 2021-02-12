
package fibonacci;

/**
 *
 * @author pammy
 */
public class Fibonacci {
   
    public static void main(String[] args) {
        int n=3;
        System.out.println(fibo(n));
    }
    
    public static int fibo(int n){
      if(n<=2){
        return 1;
      }
      return fibo(n-1)+fibo(n-2);
    }
}
