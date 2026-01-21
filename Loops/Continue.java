public class Continue {
    
    public static void main(String[] args) {
        for(int i = 1 ; i <=5 ; i++){
            if(i==3){
                continue;// continue means it print number from 1 to 5 but when i reach at 3 it skip it and print next
            }
            System.out.println(i);
        }
    }
}
