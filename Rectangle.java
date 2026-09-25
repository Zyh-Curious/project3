package task4a;


public class Rectangle extends Graph {
    public Rectangle(int a,int b){
        super(a,b);
    }
    @Override
    public void zhouchang(){
        int C = 2*getA() + 2*getB();
        System.out.println("矩形的周长是：" + C);
    }
    @Override 
    public void mianji(){
        int S = getA()*getB();
        System.out.println("矩形的面积是："+ S);
    }
}
