package Java200;

class JLocation{
    public double lat;
    public double lng;
}

public class JavaUserDefindedType {
    public static void main(String[] args) {
        double latitude = 37.123123213;
        double longitude = 127.12312412;

        JLocation jloc = new JLocation();
        jloc.lat = latitude;
        jloc.lng = longitude;

        JLocation newLoc=jloc;
        System.out.println(newLoc.lat);
    }
}
