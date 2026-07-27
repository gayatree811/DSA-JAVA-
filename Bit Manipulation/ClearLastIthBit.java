public class ClearLastIthBit {
    public static int clearlastbit(int number , int i ){
        return number & (~0 << i);
    }
    public static void main(String[] args) {
        System.out.println(clearlastbit(15, 2));
    }
    
}
