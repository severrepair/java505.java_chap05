public interface RemoteControl {
//    인터페이스의 멤버는 상수, 정적 멤버 메소드, 추상 메소드, 디폴트 메소드만 사용이 가능함
//    인터페이스에서 사용할 수 있는 멤버는 일반 멤버 변수와 메소드는 불가능하기 때문에 static 및 abstract을 생략할 수 있음
//    인터페이스는 객체 사용 설명서이기 때문에 상수, 정적 메소드, 추상 메소드, 디폴트 메소드만 사용이 가능함
//    정적 메소드 및 디폴트 메소드는 자바 버전 8부터 사용이 가능해짐

//    상수
    public int MAX_VOLUME = 10;
    public int MIN_VALUE = 0;

//    추상 메소드(abstract 생략)
    void turnOn();
    void turnOff();
    void setVolume(int volume);

//    디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        }
        else {
            System.out.println("무음 해제합니다.");
        }
    }

//    정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
    
}
