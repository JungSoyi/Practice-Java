package clothes;

public class Pants extends Product{
    public String name;
    public int price;
    public int waistSize;

    void printPrice(){
        System.out.printf("%d원 입니다.\n", price);
    }

    void printWaistSize(){
        System.out.printf("허리둘레: %d인치\n", waistSize);
    }
}
