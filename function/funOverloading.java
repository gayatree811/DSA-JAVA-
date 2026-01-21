import java.util.*;

public class funOverloading {
    public static int sum(int a , int b ){
        return a+b;
    }
    // fun to calculate 3 numbr 
    public static int sum(int a , int b , int c ){
        return a + b + c ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number ");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("enter the 3rd number");
        int c = sc.nextInt();
        System.out.println(sum(a, b));
        System.out.println( sum(a, b, c));
    }
}
