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

        String strVar1 = "정소이";
        String strVar2 = "정소이";

        if(strVar1==strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같다.");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다르다.");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같다.");
        }

        String strVar3 = new String("정소이");
        String strVar4 = new String("정소이");

        if(strVar3==strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같다.");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다르다.");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같다.");
        }

        int[] scores;
        scores = new int[]{83, 97, 87};
        int sum1 = 0;
        for(int i=0;i<3;i++){
            sum1+=scores[i];
        }

        System.out.println("총합: " + sum1);

        int sum2 = add(new int[]{83,97,87});
        System.out.println("총합: " + sum2);
        System.out.println();

        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);

        for(int i=0; i< newStrArray.length;i++){
            System.out.println(newStrArray[i]);
        }

        int[] newScores = new int[]{95, 71, 84, 93, 87};

        int sum = 0;
        for(int score:newScores){
            sum= sum + score;
        }
        double avg = sum/ newScores.length;
        System.out.println("평균 점수: "+ avg);


    }
    public static int add(int[] scores){
        int sum = 0;
        for(int i=0; i<3; i++){
            sum+=scores[i];
        }
        return sum;
    }
}
