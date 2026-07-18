public class ClearBit {
    public static int ClearIthBit(int n , int i){
        int bitmask = ~(i<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBit(10,1));
    }
}
