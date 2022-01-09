package Java200;
//상수, switch case
public class BioSwitch1 {
    //상수
//    public static final int PHYSICAL = 23;
//    public static final int EMOTIONAL = 28;
//    public static final int INTELLECTUAL = 33;
    // 메서드 선언
    public static String textInfor(PEI index, double value) {
        String result = "";
        switch (index){
            case PHYSICAL: result = "신체 지수"; break;
            case EMOTIONAL: result = "감정 지수"; break;
            case INTELLECTUAL: result = "지성 지수"; break;
            default: result = "미결정:"; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        // PEI로가며오면 PEI int로 가져오면 int
      PEI index = PEI.PHYSICAL;
      double value = 0.86;
        System.out.println("신체 지수 주기값:"+index.getPei()); //enum을 int로 변환
        String st = textInfor(index ,value);
        System.out.println(st);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}
