package Recursion;

public class acendingorder {
 static void aceorder(int n ){
    if( n == 0 ){
        return;
    }
    aceorder(n-1);
    System.out.println(n);
 }   
 public static void main(String[] args) {
    aceorder(5);
 }
}
