package _02_control_statement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 조건문 실습 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        if(age >= 1 && age <=7 ){
            System.out.println("유아");
        } else if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16){
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19){
            System.out.println("고등학생");
        } else if (age >= 20){
            System.out.println("성인");
        } else {
            System.out.println("올바른 값을 입력해주세요.");
        }


        // 조건문 실습 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = scanner2.nextLine();

        switch (name) {
            case "홍길동":
                System.out.println("남자");
                break;
            case "성춘향":
                System.out.println("여자");
                break;
            default:
                System.out.println("모르겠어요.");
                break;
        }

        // 반복문 실습
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int num = scanner3.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " ");
        }

    }


}
