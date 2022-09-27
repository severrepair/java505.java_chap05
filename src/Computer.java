public class Computer extends Calculator1 {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        System.out.println("수정된 내용임");
        return Math.PI * r * r;
    }

    @Override
    int sum() {
        System.out.println("오버라딩하여 출력하기 : " + (20 + 10));
        return 20 + 10;
    }

    @Override
    int sub() {
        System.out.println("오버라이딩하여 출력하기 : " + (10-3));
        return 10-3;
    }

}
