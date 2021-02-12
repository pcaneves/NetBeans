package fatorial;

public class Fatorial {

    public static void main(String[] args) {
        long n=20;
        System.out.println(n+"!="+Fatorial(n));
    }
  
    public static long Fatorial(long n){
      if(n<=1){
        return 1;
      }
      return n*Fatorial(n-1);
    }
}
