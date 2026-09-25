package tool;
import java.util.Random;
public class Role{
    private int blood;
    private String name;

    public Role() {
    }

    public Role(int blood,String name) {
        this.blood = blood;
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20);
        int remainblood = role.getBlood() - hurt;
        remainblood = remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);
        System.out.println(this.getName()+"对"+role.getName()+"造成了"+hurt+"点伤害，"+role.getName()+"还剩"+remainblood+"点血");

    }
}