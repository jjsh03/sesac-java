package _05_class._access_modifier._pack03;

public class B {
    public void method() {
        A a = new A(); // A와 B는 같은 패키지

        // 필드 변경
        a.filed1 = 11; // o
        a.filed2 = 22; // o
        // a.filed3 = 33; // x : private field 이므로 같은 클래스에서만 접근 가능

        // 메소드 호출
        a.method1(); // o
        a.method2(); // o
        // a.method3(); // x: private method 이므로 같은 클래스에서만 호출 가능
    }
}
