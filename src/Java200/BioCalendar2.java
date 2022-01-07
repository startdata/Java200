package Java200;

public class BioCalendar2 {
    //상수, 상수값은 변경할 수 없다.
    public static final int PHYSICAL = 23;

    public static void main(String[] args) {
        int index = PHYSICAL;
        int days = 1200;
        double phyval = 100*Math.sin((days%index)*2*Math.PI/index);
        System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
    }
}
