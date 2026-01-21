import java.util.*;
public class ZeroAndOne {
    public static void ZeroAndOne_tringle(int n ){
        int counter = 1 ;
        for(int i =  1 ; i <=n ; i ++){//outer loopp for rows 
            for (int j = 1 ; j <= i ; j++){// inner loop for colm
                if(counter % 2 == 0 ){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        ZeroAndOne_tringle(n);
    }
    
}
