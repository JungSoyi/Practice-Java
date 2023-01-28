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
   }
}
