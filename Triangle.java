package task4a;

public class Triangle extends Graph {
    public Triangle(int a,int b){
        super(a,b);
    }
    @Override
    public void zhouchang(){
        int C = 3*getA();
        System.out.println("等边三角形的周长是：" + C);
    }
    @Override 
    public void mianji(){
        double S = (3.14/4)*getA()*getA();
        System.out.println("等边三角形的面积是："+ S);
    }
}
