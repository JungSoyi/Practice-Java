import employee.Employee;

public class Main {
    public static void main(String[] args){

        String[] name = {"직원1", "직원2", "직원3"};
        int[][] hours = {{30,21,43,36,33},{30,21,43,36,33},{30,21,43,36,33}};

        Employee[] employees = new Employee[name.length];

        for(int i=0; i<name.length;i++){
            employees[i] = new Employee(name[i],hours[i]);
            employees[i].printTotalHours();
            employees[i].totalHours();
        }

    }
}