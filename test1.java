package tool;
public class test1{
    public static void main(String[] args) {
        Role r1 = new Role(100,"a");
        Role r2 = new Role(100,"b");
        while (true) { 
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+"KO了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }
    }
}