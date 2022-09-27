public class SupersonicAirplaneEx {
    public void execute() {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NOMAL;
        sa.fly();
        sa.land();
    }
}
