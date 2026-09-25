package task3;

public class Penguin extends Animal{
    
    public Penguin(String myName, int myId) {
        super(myName, myId);
    }
    @Override
    public void eat(){
        System.out.println(super.getName()+"正在吃鱼");
    } 
}
