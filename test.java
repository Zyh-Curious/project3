package tool;

public class test {
    private String usersname;
    private String password;
    private String mail;
    private String gender;
    private int age;
    public test() {
    }
    public test(String usersname, String password, String mail, String gender, int age) {
        this.usersname = usersname;
        this.password = password;
        this.mail = mail;
        this.gender = gender;
        this.age = age;
    }
    public String getUsersname() {
        return usersname;
    }
    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}