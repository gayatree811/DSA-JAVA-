
import java.util.*;
public class Qthree {
    public static void main(String[] args) {
    /*     int[] arr = {10,3,237,72,2};
        int max = arr[0];
        
        for(int i =0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the number of elements");
    

        for(int i =0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;

        for (int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("maximum number is " + max);
        sc.close();
        
    } 
}
