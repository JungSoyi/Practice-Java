import player.Player;
import player.Team;

public class Main {
    public static void main(String[] args){

        /**
         * employee 문제
         */
//        String[] name = {"직원1", "직원2", "직원3"};
//        int[][] hours = {{30,21,43,36,33},{30,21,43,36,33},{30,21,43,36,33}};
//
//        Employee[] employees = new Employee[name.length];
//
//        for(int i=0; i<name.length;i++){
//            employees[i] = new Employee(name[i],hours[i]);
//            employees[i].printTotalHours();
//            employees[i].totalHours();
//        }

        /**
         * 양궁 문제
         */
        String[] name = {"Kim", "Lee", "Park"};
        int[][] points = {{10,9,9,8},{9,10,9,9},{10,9,10,10}};

        String nation = "KOREA";
        Player[] players = new Player[name.length];

        for(int j=0; j<name.length;j++){
            Player player = new Player(name[j],points[j]);
            int result = player.score();
            players[j] = player;
            System.out.printf("선수 %s의 총 점수: %d점 \n", name[j], result );
            System.out.printf("players[%d]의 배열:",j);
            System.out.println(players[j].points);
        }

        /**
         * 양궁 팀 문제
         */
        Team teamKorea = new Team(nation, players);
        int result = teamKorea.totalScore(players);
        System.out.printf("%s -> %d points", nation, result);

    }



}