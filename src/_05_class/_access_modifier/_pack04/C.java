package _05_class._access_modifier._pack04;

import _05_class._access_modifier._pack03.A;

public class C {
    public void method() {
        A a = new A(); // A 클래스와 C 클래스는 패키지가 다르므로 import 호출

        // 필드 변경
        a.filed1 = 111;
        // a.filed2 = 222; // default field 이르모 x
        // a.filed3 = 333; // private field 이므로 x

        // 메소드 호출
        a.method1();
        // a.method2(); // default method 이르모 x
        // a.method3(); // private method 이므로 x
    }
}
