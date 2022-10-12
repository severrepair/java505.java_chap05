public class Car5 {
    Tirei[] tires = new Tirei[4];
//    Tirei[] tires = {
//        new HankookTire2(),
//        new HankookTire2(),
//        new HankookTire2(),
//        new HankookTire2()
//};

    public Car5() {
        for (int i=0; i<tires.length; i++) {
            tires[i]=new HankookTire2();
        }
    }

    void run() {
        for (Tirei item : tires) {
            item.roll();
        }
    }
}
