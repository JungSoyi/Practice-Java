package player;

public class Player {
    // 1. 필드 정의
    static String name; //선수 이름
    public static int[] points; //득점 상황


    // 2. 생성자 만들기
    public Player(String name, int[] points){
        this.name = name;
        this.points = points;
    }

    // 3. 메서드 정의: 선수 별 총 점 계산하기
    public static int score(){
        int total_score=0;
        for(int i=0; i<points.length; i++){
            total_score += points[i];
        }
        return total_score;
    }

}
