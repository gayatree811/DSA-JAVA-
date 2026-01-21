import java.util.*;

public class primeOrnot {
    public static boolean isprime(int n ){
        boolean isprime = true;
        for(int i = 2 ; i <=n-1 ; i++){
            if(n % i == 0 ){
            isprime=false;
            break;
        }
    }
    return isprime;
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number to know prime or not");
    int n = sc.nextInt();
    System.out.println(isprime(n));
}
}
