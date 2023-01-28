package clothes;

public class Product {
    /**
     * getter/setter 메서드를 사용하지 않아 임시로 public으로 설정!
     */
    public String name; // 이름
    public int price; // 가격

    void printPrice(){
        System.out.printf("%d원 입니다.\n", price);
    }
}
