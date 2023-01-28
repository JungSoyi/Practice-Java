package basic;

public class main {
    public static void main(String[] args) {
        while(true){
            int num = (int) (Math.random()*6)+1;
            System.out.println(num);
            if(num == 6) {
                System.out.println("종료할게용");
                break;
            }
        }
    }
}
