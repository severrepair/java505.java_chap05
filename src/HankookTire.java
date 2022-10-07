public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }
    
    @Override
    public boolean roll() {
        ++accumulatedRotation;
//        누적회전수가 최대 회전수보다 작을시 출력
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire 수명 : " + (maxRotation- accumulatedRotation) + "회");
            return true;
        }
        else {
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
    
}
