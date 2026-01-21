// variable = condition ? statement1 : statement 2 ;

public class TernaryOperator {
    public static void main ( String args[]){
        int num = 10 ;
        String type = (( num % 2 == 0 )? "even" : "odd");
        System.out.println(type);

        // pass or fail
        int marks = 60 ;
        String reportcard = marks >= 33 ? "pass": "fail";
        System.out.println(reportcard); 
    }
}
