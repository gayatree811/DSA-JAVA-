// shallowcopy ,deep copy

public class Qfive {

    public static void main(String[] args) {
        int[] arr = {10,12,13};
        int [] x = arr;
        x[0] = 100;
        System.out.println(arr[0]);
    }
}