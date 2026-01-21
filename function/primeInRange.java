// to check all prime numbers in a range
import java.util.*;

public class primeInRange {
    public static boolean primeInRang(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range: ");
        int n = sc.nextInt();
        System.out.println("prime numbers are:");
        for (int i = 2; i <= n; i++) {
            if (primeInRang(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}


    





