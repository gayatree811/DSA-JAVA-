package OOPS;

public class getter {
    private String name = "gayatree";

    public String getName(){
        return name;

    }
    public static void main(String[] args) {
        getter s = new getter();
        System.out.println(s.getName());
    }
}
