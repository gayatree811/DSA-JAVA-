import java.util.*;
public class HollowRectangle {
    public static void hollowrectangle(int totalrow , int totalcolm){
        //outer loop 
        for( int i = 1 ; i <=totalrow ; i ++){
            //inner loop
            for(int j = 1 ; j <= totalcolm ; j++){
                //boundary condition cell (i and j )
                if ( i == 1 || i == totalrow || j ==1 || j == totalcolm){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

            public static void main( String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the number of rows");
                int totalrow = sc.nextInt();
                System.out.println("enter the nmber of colm");
                int totalcolm = sc.nextInt();
                 hollowrectangle(totalrow ,totalcolm);
                
            
        }

    }
    

