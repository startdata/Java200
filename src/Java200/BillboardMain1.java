package Java200;

public class BillboardMain1 {
    public static void main(String[] args) {
        int rank = 1;
        String song = "Despacito"; //문자열 저장
        //Data를 그릇에 담는다.
        int lastweek = 1;
        String imagesrc="https://www.billboard.com/images/gref_images/q61808osztw.jpg";
        String artist="luis fonsi";
        String sf = String.format("%d,%s,%d,%s,%s",rank,song,lastweek,imagesrc, artist);
        System.out.println(sf);

    }
}
