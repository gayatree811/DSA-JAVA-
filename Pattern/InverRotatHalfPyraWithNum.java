import java.util.*;
public class InverRotatHalfPyraWithNum {
    public static void invrohalfwithNum(int n){
        /* for ( int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <= n - i + 1 ; j++)  */

            
            for(int i = n ; i>=1 ; i -- ){
                for(int j =1 ; j <=i ; j ++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of rows");
    int n = sc.nextInt();
    invrohalfwithNum(n);

}
}


//or 
