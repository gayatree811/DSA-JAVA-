import java.util.*;

public class BinaryTodecimal {
    public static int binarytodecimal(int binary){
        int decimal = 0 ;
        int power = 0;
        
        while(binary !=0 ){
            int lastdigit = binary % 10 ;
            decimal = decimal + lastdigit * (int)Math.pow(2, power);
            power ++;
            binary = binary /10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to find ");
        int binary = sc.nextInt();
        int result = binarytodecimal(binary);
        System.out.println("Decimal value = " + result);
    }
}
