

public class Qtwo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5};
        int sum = 0;
        for(int i =0 ; i <arr.length; i++){
             sum += arr[i];
        }
        System.out.print("sum  = " + sum);
    }
    
}

// another method
/* 
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */

/* print the product of an array elements */

/* import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        System.out.println("enter the " + n +  "elements");
         

        int [] arr = new int[n];

        for(int i =0; i <n ; i++){
            arr[i]  = sc.nextInt();
        }
        int product = 1 ;
        for (int i =0; i<n ; i++ ){
            product *= arr[i];
        }
        System.out.println("product " +  product);
     }
     
} */