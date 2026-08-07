package Recursion;

public class removeDuplicate {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);

        //check char is already present
        if(map[curr - 'a']){
            removeDuplicate(str, idx + 1, newStr, map);
        }
        //character is not present
        else{
            map[curr - 'a'] = true;
            newStr.append(curr);
            removeDuplicate(str, idx + 1 , newStr, map);
        }
    }
    public static void main(String[] args) {
        String str = "apple";
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
