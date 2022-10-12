public class ImplEx {
    public static void main(String[]args) {
        System.out.println("구현체 implC의 객체 impl은 모든 메소드 사용 가능");
        ImplC impl = new ImplC();
        
        impl.methodA();
        impl.methodB();
        impl.methodC();
        
        System.out.println("\nInterfaceA의 변수에 대입 시 ");
        InterfaceA ifA = impl;
        ifA.methodA();

        System.out.println("\nInterfaceB의 변수에 대입 시 ");
        InterfaceB ifB = impl;
        ifB.methodB();

        System.out.println("\nInterfaceC의 변수에 대입 시 ");
        InterfaceC ifC = impl;
        ifC.methodA();
        ifC.methodB();
        ifC.methodC();
    }
}
