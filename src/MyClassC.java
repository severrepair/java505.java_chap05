public class MyClassC implements MyInterface2 {
//    MyInterface 에서 상속해준 추상 메소드
    @Override
    public void method1() {
        System.out.println("MyClassC의 method1() 실행");
    }

//    MyInterface에서 디폴트메소드로 상속해줬으나 MyInterface2에서 추상 메소드로 오버라이딩한 메소드
//    MyInterface2를 구현하는 구현체는 반드시 해당 메소드를 구현해야함
    @Override
    public void method2() {
        System.out.println("MyClassC의 method2() 실행");
    }
    
//    MyInterface2 전용으로 생성한 추상메소드
    @Override
    public void method3() {
        System.out.println("MyClassC의 method3() 실행");
    }
}
