package adventurer;

public class Adventurer {
    protected String name;
    protected int hp;

    public Adventurer(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }


    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int h){
        hp = h;
    }

    public void punch(){
        System.out.printf("[%s]의 펀치!\n", name);
    }

    public void tostring(){
        System.out.printf("[%s]의 HP: %d \n", name, hp);
    }
}
