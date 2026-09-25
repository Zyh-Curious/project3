package task4a;

public class test {
    public static void main(String[] args) {
        Graph c = new Circle(2, 0);
        Graph r = new Rectangle(2, 3);
        Graph t = new Triangle(4, 0);
        c.zhouchang();
        c.mianji();
        r.mianji();
        t.zhouchang();
    }
}
