import java.util.Scanner;

public class Code02_1 {
    public static long gcd(long m , long n){
       if (n==0){
           return m;
       }else {
          return gcd(n, m%n);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  m = sc.nextLong();
        long n = sc.nextLong();
        long x = gcd(m,n);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<x; i++){
           sb.append(1);
        }
        System.out.println(sb);
    }
}
