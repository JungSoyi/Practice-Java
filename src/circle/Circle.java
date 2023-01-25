package circle;

public class Circle {
    // 1. 필드 추가
    int x; // 원의 중심 x좌표
    int y; // 원의 중심 y좌표
    int r; // 원의 반지름

    // 2. 생성자 추가
    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // 3. 메서드 추가
    public static double area(Circle circle){
        double result = Math.PI * circle.r * circle.r;
        return result;
    }
}
