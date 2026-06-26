// print the minimum elements

import java.util.Scanner;

public class Qfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the numbers of the array");
        

        for (int i = 0 ; i <n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i =0 ; i <arr.length; i++){
            if(arr[i] >max ){
                max = arr[i];
            }
        }
        System.out.println("maximum elements is " + max );

    }
}
