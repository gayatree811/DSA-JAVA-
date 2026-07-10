 public class ToUpperCase {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();

        //first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        //remaining 
        for(int i =1; i<str.length();i++){
            if(str.charAt(i - 1)== ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str= "hii i am gayatree";
        System.out.println(toUpperCase(str));
    }
} 