package employee;

public class Employee {
    /**
     * 1. 클래스 필드 정의하기
     */
    public static String name;
    public static int[] hours;
    int count=0;

    /**
     * 2. 클래스 생성자 만들기
     */
    public Employee(String name, int[] hours){
        this.name = name;
        this.hours = hours;
    }

    public void printTotalHours(){
        for(int i=0; i<hours.length; i++) {
            System.out.printf("일한 시간: %d 시간 \n", hours[i]);
            count+=hours[i];
        }
    }

    public int totalHours(){
        System.out.printf("총 일한 시간: %d 시간",count);
        return count;
    }

}
