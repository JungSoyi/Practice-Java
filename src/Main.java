import employee.Employee;

public class Main {
    public static void main(String[] args){

        String name = "소이";
        int[] hours = {30,21,43,36,33};
        Employee employee = new Employee(name, hours);
        employee.printTotalHours();
        employee.totalHours();
    }
}