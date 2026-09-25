package task1;

public class Person {
    private String name;
    private int age;
    private String gender;

    private void eat() {
        System.out.println(name + "正在吃东西");
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(Person other){
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
