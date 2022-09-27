package package2;

import package1.A;

//A 클래스 타입의 protected로 바꾸면 에러 나온다.
public class C {
//    A 클래스는 접근제한자가 public으로 설정되어 A클래스 타입의 변수는 생성할 수 있음
    public void mehtod(){
//        A a;
//        A 클래스의 생성자에 접근제한자가 protected로 설정되어 생성자가 접근할 수 없음
//        A a = new A();  //A 클래스 생성자에 protected로 해서 막히게 할수 있다.
//        A 클래스의 멤버 변수에 접근 제한자가 protected로 설정되어 멤버 변수에 접근할 수 없음
//        a.value = "Value";
//        A 클래스의 멤버 메소드에 접근제한자가 protected로 설정되어 멤버 메소드에 접근할 수 없음
//        a.method();
    }
}
