import java.util.*;

public class DecimalToBinary {
    public static int dectobin(int n ){
        int power = 0 ;
        int binNum = 0 ;
        while(n>0){
            int reminder = n % 2 ;
            binNum = binNum + (reminder * (int)Math.pow(10, power));
            power++;
             n = n / 2 ;
        }
       return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n = sc.nextInt();
        int result = dectobin(n);
        System.out.println("Binary value = " + result);
    }
    
    
}
