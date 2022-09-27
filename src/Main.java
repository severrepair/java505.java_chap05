import package1.B;

public class Main {
    public static void main(String[] args) {
//        2022-09-27
        System.out.println("-----상속-----");

        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();//컬러포인트 클래스 cp객체 = new 객체 생성 생성자(메모리등록)를 가지고 객체 생성한다.
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();

//        문제1) 클래스 SumSub와 MultiDiv을 생성하고, Sumsub에는 멤버 변수 num1, num2를
//        가지고 멤버 메소드 sum(), sub()를 가지도록하며, MultiDiv에는 멤버 변수 result,
//        멤버 메소드 multi(), div()를 가지도록 하여, 마지막으로 Calcultor 클래스를 생성하여
//        두 개의 클래스 모두를 상속받아 모든 기능을 사용할 수 있는 클래스로 작성하고, 각각 사칙연산을
//        수행하시오.
//        1. SumSub > MultiDiv > Calculator 순서대로 상속받기
//        2. Calculator클래스는 나머지 연산을 위한 멤버 메소드 other()를 가지고 있음

        System.out.println("-----예제1-----");
        Calculator cal = new Calculator();
        cal.num1 = 10;
        cal.num2 = 3;

        cal.result = cal.Sum();
        System.out.println("두 수의 덧셈 : " + cal.result);
        cal.result = cal.Sub();
        System.out.println("두 수의 뺄셈 : " + cal.result);
        cal.result = cal.Multi();
        System.out.println("두 수의 곱셈 : " + cal.result);
        cal.result = cal.Div();
        System.out.println("두 수의 나누기 : " + cal.result);
        cal.result = cal.Other();
        System.out.println("두 수의 나머지 : " + cal.result);
        
        System.out.println("\n-------휴대폰-------\n");


        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);

        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);

        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.senVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
        dmbCellPhone.senVoice("아~ 예 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();


        Student std = new Student("홍길동", "123456-1234567",1);

        System.out.println("\n-----------\n");
        int r = 10;

//        실행부분에 3.14159를 직접입력했음
        Calculator1 calculator1 = new Calculator1();
        System.out.println("원면적 : " + calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

//        실행부분에 Math.PI에 있는 상수값을 가져옴
        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());

        System.out.println("\n\n");

        SupersonicAirplaneEx supersonicAirplaneEx = new SupersonicAirplaneEx();
        supersonicAirplaneEx.execute();
        Math.random();

        B b = new B();
        b.method();


//        문제2) 교재 234 페이지의 실습문제 1번



    }
}