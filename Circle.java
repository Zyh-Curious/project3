package task4b;
public class Circle extends Graph {
    public Circle(int a,int b){
        super(a,b);
    }
    @Override
    public void zhouchang(){
        double C = 2*3.14*getA();
        System.out.println("圆的周长是：" + C);
    }
    @Override 
    public void mianji(){
        double S = 3.14*getA()*getA();
        System.out.println("圆的面积是："+ S);
    }
}
