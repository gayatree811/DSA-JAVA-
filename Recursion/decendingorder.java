package Recursion;

/**
 * decendingorder
 */
public class decendingorder {

    static void printdec(int n ){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        printdec(n - 1);
    }
    public static void main(String[] args) {
        printdec(5);
    }
}