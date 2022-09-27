public class ColorPoint extends Point {//extends Point 로 Point 클래스에 있는 멤버를 사용할수있다.
    private String color;   //직접접근 안되서 간접접근이 가능

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }

//    private int x;  // 외부에선 접속이 안됨
//    private int y;
//
//    public void set(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public void showPoint() {
//        System.out.println("(" + x + "," + y + ")");
//    }

}//클래스
