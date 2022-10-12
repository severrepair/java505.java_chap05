public class Car4 {
    Tirei frontLeftTire = new HankookTire2();
    Tirei frontRightTire = new HankookTire2();
    Tirei backLeftTire = new HankookTire2();
    Tirei backRightTire = new HankookTire2();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
