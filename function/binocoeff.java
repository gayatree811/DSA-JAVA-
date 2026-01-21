import java.util.*;
public class binocoeff {
    public static int fac(int n ){
        int f = 1;
        for(int i = 1 ; i <=n ; i++){
            f = f * i ;
        }
        return f ;
    }
    static  int binocoef(int n , int r){
        int nfac=fac(n);
        int rfac = fac(r);
        int nmrfac = fac(n-r);

        int binocoef= nfac/(rfac * nmrfac);
        return binocoef;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = sc.nextInt();
        System.out.println("enter the number r ");
        int r = sc.nextInt();

        System.out.println("binomial coefficient is " + binocoef(n, r));
    }
}
