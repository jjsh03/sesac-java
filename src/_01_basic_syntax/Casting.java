package _01_basic_syntax;

// 형변환
// - 데이터 타입 변환
// - (type) var
//      - type: 데이터 타임
//      - var: 변수명

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        // 묵시적 형변환 (Wider Conversion)
        // - 작은 타입에서 큰 타입으로 자동 형변환
        // - 반대의 경우에는 명시적으로 형변환 해야 함
        int smallNumber = 10;
        double bigNumber = smallNumber; // int 를 double로 자동 형 변환

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("bigNumber: " + bigNumber);

        // 명시적 형변환 (Narrow Conversion)
        // - 더 큰 타입에서 작은 타입으로 강제 변환
        // - 주의) 큰 타입에서 작은 타입으로 강제 변환을 하다 보니 데이터 손실이 날 수 있음
        double anotherBigNumber = 20.5;
        int anotherSmallNumber = (int) anotherBigNumber; // double을 int로 형변환

        System.out.println("anotherBigNumber: " + anotherBigNumber);
        System.out.println("anotherSmallNumber: " + anotherSmallNumber);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.println("안녕하세요! " + name + "님 " + "(" +age + "세"+")");
    }
}
