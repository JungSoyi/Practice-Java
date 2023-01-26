package player;

public class Team {
    // 1. 필드 생성하기
        String nation; // 국적
        Player[] players = new Player[]{};

    // 2. 생성자 만들기
        public Team(String nation, Player[] players){
            this.nation = nation;
            this.players = players;
        }
    // 3. 메서드 만들기
        public static int totalScore( Player[] players){
            int result = 0; // 국가별 총 점수
            for(int i=0; i<players.length; i++){
                System.out.println("players.length: "+players.length);
                System.out.printf("players[%d]의 배열:",i);
                System.out.println(players[i].points);
                System.out.printf("players[%d]의 선수이름:",i);
                System.out.println(players[i].name);
                result += players[i].score();
            }
            return result;

        }
}
