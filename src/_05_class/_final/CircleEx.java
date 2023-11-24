package _05_class._final;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요: ");
        int radius = sc.nextInt();
        Circle circle= new Circle(radius);
        System.out.println("원의 반지름: " + circle.getRadius());
        System.out.println("원의 넓이: " + circle.circleArea());
    }
}
