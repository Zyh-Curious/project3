package task2;

public class Person1 {
    private String name;
    private int age;
    private String gender;
    static int num = 4; 

    private void eat() {
        System.out.println(name + "正在吃东西");
    }
    public static void  Number(){
        System.out.println("创建的方法数量为："+num);
    }

    public Person1() {
    }

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person1(Person1 other){
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
