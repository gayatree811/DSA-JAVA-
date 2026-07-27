public class ClearRangeBits {

    public static int clearRangeBits(int number, int i, int j) {

        int left = (~0) << (j + 1);
        int right = (1 << i) - 1;
        int mask = left | right;

        return number & mask;
    }

    public static void main(String[] args) {

        System.out.println(clearRangeBits(255, 2, 5));

    }
}