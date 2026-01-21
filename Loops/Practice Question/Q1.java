// keep entering numbers till user enter a multiple of 10..
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Enter your number : ");
            int num = sc.nextInt();
            if (num % 10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
    }
    
}
