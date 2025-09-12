public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.prntStatus();
        motor.kecepatan = 50;

        motor.nyalakanMesin();
        motor.prntStatus();

        motor.tambahKecepatan();
        motor.prntStatus();

        motor.tambahKecepatan();
        motor.prntStatus();

        motor.tambahKecepatan();
        motor.prntStatus();

        motor.matikanMesin();
        motor.prntStatus();
    }
}
