package OOPS;
interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("dog bark");
    }
}

class cat implements animal{
    public void sound(){
        System.out.println("cat meows");
    }
}
public class interfacee {
    public static void main(String[] args){
        animal a;
        a = new dog();
        a.sound();
        a = new cat();
        a.sound();
    }
}
