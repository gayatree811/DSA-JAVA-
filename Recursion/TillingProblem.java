package Recursion;

public class TillingProblem {
    public static int TillingProblem(int n ){
        // base case
        if(n == 0 || n == 1 ){
            return 1 ;
        }
        // vertical tile-> n - 1
        int vertical = TillingProblem(n - 1);

        // horizontal -> n- 2
        int horizontal = TillingProblem(n- 2);

        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(TillingProblem(n));
    }
}
