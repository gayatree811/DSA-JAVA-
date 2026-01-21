/* public class ReverseANumber {
    public static void main(String[] args) {
        int num = 10988;
        int reverse = 0;

        while(num !=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num / 10;
            
        }
        System.out.print(reverse);
    }
    
} */

import java.util.*;
public class ReverseANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number != 0){
            int digit = number % 10; // gets the last digit 
             reverse = reverse * 10 + digit; // add digit to the reverse
             number = number / 10; // remove last digit
        }
        System.out.println("reverse number " + reverse);
    }
}