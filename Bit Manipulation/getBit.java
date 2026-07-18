public class getBit {
    static int getBit(int number, int position){
        int mask = 1 << position;

        if((number & mask) == 0){
            return 0;
        }else{
            return 1 ;
        }
    }
    public static void main(String[] args) {
        System.out.println(getBit(10, 2));
        System.out.println(getBit(10, 3));
    }
}
