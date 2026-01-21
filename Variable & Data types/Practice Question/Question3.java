// enter cost of 3 item from the user(using float data type) i.e a pencil , pen and eraser. you have to o/p the total cost of the item . In advance you also try accing 18%  gst tax to the item in the bill in advance problem


import java.util.*;
public class Question3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the price of pen");
        float pen = sc.nextFloat();

        System.out.println("enter the price of the pencil");
        float pencil = sc.nextFloat();

        System.out.println("enter the price of eraser");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float gst = total * 0.18f;

        float finalbill = total + gst;

        System.out.println("Total value without gst = " + total);
        System.out.println(" Gst (18%) = " + gst);
        System.out.println("Final bill amount = " + finalbill);
    }    
}
