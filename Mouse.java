package task3;

public class Mouse extends Animal {

    public Mouse(String myName, int myId) {
        super(myName, myId);
    }
    @Override
    public void eat(){
        System.out.println(super.getName() + "正在偷吃粮食");
    }
    

    
}
