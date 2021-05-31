package App.Interface;

public class Pig implements Animal2 {
    public void sleep(){
        System.out.println("Zzz");
    }
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void running(){
        System.out.println("Animals run");
    }
}
