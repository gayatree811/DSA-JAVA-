public class unarray {
    public static void main (String args[]){
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);
        // here the value 1st increment then the value updated to b ...

        //  int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // but here the value 1st updated means the a value 1st updated to 11 and stored to a , and at that time the a value means 10 assign to b so the output will be a = 11 , b = 10;

        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}
