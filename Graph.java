package task4a;


public abstract class Graph {
    private int a;
    private int b;

    public Graph() {
    }

    public Graph(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public abstract void  zhouchang();
    
    public abstract void mianji();

}
