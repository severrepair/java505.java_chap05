public class Point {
    private int x;  // 외부에선 접속이 안됨
    private int y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
