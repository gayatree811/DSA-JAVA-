
import java.util.*;
public class productOfNum {
    public static int multiply(int a , int b){
        return a*b;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number ");
        int a = sc.nextInt();
        System.out.print("enter the 2nd number ");
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("product is " + product);
    }
    
}
