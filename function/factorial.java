import java.util.*;

public class factorial {
    public static int fac(int n ){
        int f = 1 ;
        for(int i = 1 ; i <=n ; i++){
            f = f* i;
        }
        return f;

    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();

    int result = fac(n);
    System.out.println("factorial of " + n + " is " + result);


}
};





