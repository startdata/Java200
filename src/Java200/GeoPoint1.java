package Java200;

public class GeoPoint1 {
    public static void main(String[] args) {
        double latitude1 = 37.123214124124;
        double longtitude1 = 127.123124125125;
        double latitude2 = 35.123525125125;
        double longitude2 = 129.1251251515;

        //(위도,경도) 객체
        Geo geo1 = new Geo();
        geo1.latitude = latitude1;
        geo1.longtitude = longtitude1;
        System.out.println(geo1.latitude+"\t"+geo1.longtitude);

        Geo geo2 = new Geo();
        geo2.latitude = latitude2;
        geo2.longtitude = longitude2;
        //객체 전달
        Geo geo = geo1;
        System.out.println(geo.latitude+"\t"+geo.longtitude);
    }
}
