package _02_control_statement;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메소드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(10.0, 20.8));
        System.out.println(ol.add(1, 4, 6));
        System.out.println(ol.add(1.1, 2.2, 3.3));

        // practice 1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("덧셈 결과 : " + (a + b));
        System.out.println("뺄셈 결과 : " + (a - b));
        System.out.println("나눗셈 결과 : " + (a / b));
        System.out.println("곱셈 결과 : " + (a * b));


        // practice 2.
        MethodOverloading area = new MethodOverloading();
        System.out.println("반지름이 5인 원의 넓이:" + area.area(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이:" + area.area(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이:" + area.area(6, 3, 2));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // practice 2.
    public double area(double x) {
        double pi = Math.PI;
        return x * x * pi;
    }

    public double area(double x, double y) {
        return x * y;
    }

    public double area(double x, double y, double z) {
        return x * y / z;
    }

}
