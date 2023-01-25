package fishBread;

public class FishBread {
    // 1. 필드 만들기
    public static int count;
    String flavor;

    // 2. 생성자 만들기
    public FishBread(String flavor){
        this.flavor = flavor;
    }
    // 3. 메서드 만들기
    public void flavorCount(){
     count++;
        System.out.printf("[%s] 붕어빵 \n", flavor);
    }
}
