// take input the side of a squre and you have to find the area of the squre..


import java.util.*;
public class Question2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of the squre");
        int side = sc.nextInt();

        int area= side * side ;
        System.out.println("The area of the squre is = " + area);
    }
}
