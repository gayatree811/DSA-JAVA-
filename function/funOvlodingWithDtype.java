

public class funOvlodingWithDtype {
    public static int sum(int a , int b){
        return a+b;
    }
    //fun to calculate float sum
    public static float sum(float a , float b ){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(3.4f, 2.2f));
    }
    
}
