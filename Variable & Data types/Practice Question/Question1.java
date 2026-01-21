// take input of 3 number ad find the avg of these number

/*

public class Question1 {
    public static void main (String args[]){
        int a = 10; 
        int b = 11;
        int c = 13;
        int avg = (a+b+c)/2;
        System.out.println(avg);
    }
}
    
*/

import java.util.*;
public class Question1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();

         System.out.println("enter 2nd number");
        int b = sc.nextInt();

         System.out.println("enter 3rd number");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("Average of 3 number is = " + avg);
    }
}