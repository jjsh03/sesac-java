package _05_class;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rectangle> rectangleList = new ArrayList<>();

        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력하세요 (0 0 입력 시 종료): ");
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            if (w < 0 || h < 0) {
                System.out.println("양수를 입력하세요.");
                continue;
            }

            if (w == 0 && h == 0) {
                break;
            }

            Rectangle rec = new Rectangle(w);
            rec.setHeight(h);
            rectangleList.add(rec);
        }

        for (Rectangle rec : rectangleList) {
            System.out.println("가로 길이는: " + rec.getWidth() + "\n세로 길이는: " + rec.getHeight() + "\n넓이는: " + rec.getArea() + "\n================");
        }
        System.out.println("Rectangle 인스턴스의 개수는: " + rectangleList.size());
    }
}
