public class UpdateBit {

    // Set i-th bit
    public static int setBit(int number, int position) {
        return number | (1 << position);
    }

    // Clear i-th bit
    public static int clearBit(int number, int position) {
        return number & (~(1 << position));
    }

    // Update i-th bit
    public static int updateIthBit(int number, int position, int newBit) {

        if (newBit == 0) {
            return clearBit(number, position);
        } else {
            return setBit(number, position);
        }
    }

    public static void main(String[] args) {

        System.out.println(updateIthBit(10, 2, 1)); // 14
        System.out.println(updateIthBit(10, 3, 0)); // 2

    }
}