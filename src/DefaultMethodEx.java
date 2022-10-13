public class DefaultMethodEx {
    public static void main(String[]args) {
        MyInterface m1 = new MyClassA();
        m1.method1();   //추상 메소드, 오버라이딩
        m1.method2();   //defalut 메소드

        MyInterface m2 = new MyClassB();
        m2.method1();   //오버라이딩
        m2.method2();   //오버라이딩

        MyClassA mca = new MyClassA();
        mca.method1();
        mca.method2();

        MyClassB mcb = new MyClassB();
        mcb.method1();
        mcb.method2();
    }
}
