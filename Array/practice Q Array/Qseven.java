// search in array

public class Qseven {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int search = 30;
        boolean found = false;

        for(int i =0; i < arr.length; i++){
            if(arr[i] == search){
                System.out.println("element is found in index "+ i);
                found = true;
                break;
            }
           
        }
         if(!found){
                System.out.println("not available");
            }
    }   
}
