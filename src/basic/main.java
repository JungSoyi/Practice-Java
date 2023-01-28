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

        /**
         * 이중 반복문에서 break로 바깥 반복문까지 종료하고 싶을 땐, break 뒤 바깥 반복문의 라벨을 붙인다.
         */
        Outter: for(char upper = 'A'; upper<='Z'; upper++){
            for(char lower='a'; lower<='z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower=='g'){
                    break Outter;
                }
            }
        }
        System.out.println("Outter 종료");

        /**
         * continue: 조건에 만족하면 다음 문장을 실행하지 않고 다음 반복으로 넘어간다.
         */
        for(int i=1; i<11; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
   }
}
