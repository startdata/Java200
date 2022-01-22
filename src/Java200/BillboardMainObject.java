package Java200;

public class BillboardMainObject {
    public static void main(String[] args) {
        Billboard b1 = new Billboard(1,"Despacito",1,
                "http://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        Billboard b2 = new Billboard(2,"That's What I Like",2,
        "http://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
        Billboard b3 = new Billboard(3,"I'm The One",3,
                "http://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");

        showAbout(b1);  //1개 객체
        showAbout(b2);  //1개 객체
        showAbout(b1,b2); //2개 객체
        showAbout(b1,b2,b3);   //3개 객체
        Billboard[]b = new Billboard[3];
        b[0] = new Billboard(1,"Despacito",1,
                "http://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
        b[1]=b2;    //생성해도 좋고, 생성된 객체를 받아도 된다.
        b[2]=b3;
        showAbout(b[0],b[1]);   //2개 객체
        showAbout(b);   //배열 -> 3개 객체
    }

    private static void showAbout(Billboard bb) {   //객체를 전달하여 출력
        System.out.println("1----------------------");
        String sf = String.format("%d,%s,%d,%s",
                bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagessrc(),bb.getArtist());
        System.out.println(sf);
    }
    public static void showAbout(Billboard ...b){   //객체를 전달하여 출
        System.out.println("2----------------------");
        for(Billboard bill : b){
            showAbout(bill); //1
        }
        System.out.println("<====================2");
    }
}
