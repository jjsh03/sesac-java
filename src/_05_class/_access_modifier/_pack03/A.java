package _05_class._access_modifier._pack03;

public class A {
    public int filed1; // public field
    int filed2; // default field
    private int filed3; // private field

    // constructor
    public A() {
        // 클래스 내부에서는 접근 제어자 영향을 받지 않음!
        filed1 = 1;
        filed2 = 2;
        filed3 = 3;

        method1();
        method2();
        method3();
    }

    // public method
    public void method1() {}

    // default method
    void method2() {}

    // private method
    private void method3() {}
}
