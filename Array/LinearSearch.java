/* public class LinearSearch {
    public static int search(int numbers[], int key){

        for(int i = 0 ; i <numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8};
        int key = 6;
        
        int index= search(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
           System.out.println("Key is at index" +" " + index); 
        }
    }
} */

   

    import java.util.*;

public class LinearSearch {

    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();   // size of array

        int numbers[] = new int[n];  // array created

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();   // read each element
        }

        System.out.println("Enter the key:");
        int key = sc.nextInt();

        int index = search(numbers, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
