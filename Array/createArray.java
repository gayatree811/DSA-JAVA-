import java.util.*;

public class createArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]=new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("bio : " + marks[2]);

        // if we update the value
        marks[2]=100;
        System.out.println("bio :" + marks[2]);

        // percentage
        int percentage = marks[0] + marks[1]+marks[2] / 3;
        System.out.println("percentage is = " + percentage +"%");

        // to know the length of array 
        System.out.println("length of array = "+ marks.length);
    }
}
