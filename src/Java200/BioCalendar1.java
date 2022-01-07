package Java200;

public class BioCalendar1 {
    //연산 % */
        public static final int PHYSICAL = 23; //상수(개발자 정의), 상수값은 별경 불가

        public static void main(String[] args) {
            int index=PHYSICAL;
            int days = 1200;
            //Math.PI 3.14에서 정의되어 있는 상수
            double vals = (days %index) * 2 * Math.PI/index;
            System.out.println(Math.toDegrees(vals)+"도");
        }
}
