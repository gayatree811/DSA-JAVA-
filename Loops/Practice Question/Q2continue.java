
// display all numbers entered by the user except multiples of 10
import java.util.*;
public class Q2continue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number");
            int num = sc.nextInt();
            if (num % 10 == 0){
                continue;
            }
            System.out.println("number is : " + num);
        }while(true);
    }
    
}
