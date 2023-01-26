package adventurer;

public class Adventurer {
    public String name;
    public int hp;

    public void punch(){
        System.out.printf("[%s]의 펀치!\n", name);
    }

    public void tostring(){
        System.out.printf("[%s]의 HP: %d \n", name, hp);
    }
}
