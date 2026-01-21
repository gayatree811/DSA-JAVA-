// && -> Logical AND -> when bothr are true o/p will be true otherwise fase
// || -> Logical OR// when 2 statement false then the o/p will be false otherwise true
// ! -> Logical NOT

public class Logical {
    public static void main(String[] args) {
        System.out.println( (3 > 2) && (5 > 4));// Logical AND
        System.out.println( (3 > 2) && (5 > 6));
        System.out.println( (3 > 2) || (5 > 6));
        System.out.println( (3 > 8) || (5 > 6));
        System.out.println( !(3 > 8) );
        System.out.println( !(3 > 1) );
    }
    
}
