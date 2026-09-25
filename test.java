package task1;

public class test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("zhangsan");
        System.out.println(p.getName());
        Person p1 = new Person("lisi",18,"男");
        System.out.println(p1.getName()+ " "+p1.getAge()+" "+p1.getGender());
        Person p2 = new Person(p1);
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getGender());

    }
    
}
