package task2;

public class test2 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.setName("zhangsan");
        System.out.println(p.getName());
        Person1 p1 = new Person1("lisi",18,"男");
        System.out.println(p1.getName()+ " "+p1.getAge()+" "+p1.getGender());
        Person1 p2 = new Person1(p1);
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getGender());
        Person1.Number();

    }
    
}
