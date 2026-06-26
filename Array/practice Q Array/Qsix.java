// multiply odd indexed elements by 2 and add 10 to even indexed elements
public class Qsix {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50,60};

        for (int i =0 ; i < arr.length; i ++){
            if (i % 2 == 0 ){
                arr[i] += 10;

            }else{
                arr[i] *= 2;
            }
        }
        for(int i = 0 ; i< arr.length; i++){
              System.out.print(arr[i] + " ");
        }
       
    }
}
