import player.Player;

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
        for(int i=0; i<name.length;i++){
            Player player = new Player(name[i],points[i]);
            player.score();
        }

    }
}