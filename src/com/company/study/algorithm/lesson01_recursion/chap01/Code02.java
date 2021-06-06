import java.util.Scanner;

public class Code02 {
    public static int gcd(int m , int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int g = gcd(m, n);
        System.out.println(g);
    }
}
