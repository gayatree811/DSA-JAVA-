package Recursion;

public class friendspairing {
    public static int friendspairing(int n ){

    
    if(n ==1 || n ==2 ){
        return n ;

    }
    //case 1 
    int single = friendspairing(n - 1);
    //case 2 
    int pair = (n - 1) * friendspairing(n-2);
    return single + pair;
}
public static void main(String[] args) {
    int n = 4;
    System.out.println(friendspairing(n));
}
}
