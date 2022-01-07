package Java200;

public class JavaTypeConversion {
    public static void main(String[] args) {
        String slat = "37.52323242424";
        //String slat = "hello";
        //공백 제거 후 double로 타입 변환
        double latitude = Double.parseDouble(slat.trim());
        System.out.println(latitude);
    }
}
