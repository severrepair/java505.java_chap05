public interface MyInterface2 extends MyInterface {
    
//    부모 인터페이스인 MyInterface에서 상속받은 멤버 메소드 중 디폴트 메소드인 method2()를 오버라이딩 하여 추상메소드로 변환
    @Override
    void method2();

    void method3();
}
