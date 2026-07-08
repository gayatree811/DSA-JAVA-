

public class StrCompare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = new String("Tony");

        if(s1.equals(s2)){
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
