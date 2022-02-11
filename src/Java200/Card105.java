package Java200;

public class Card105 {
    private String cardVal;
    public String getCardVal(){
        return cardVal;
    }
    public Card105(){
        int deck = (int)(Math.random()*CardUtil.SUIT.length); //0~1
        int suit = (int)(Math.random()*CardUtil.VALU.length); //0~9
        //임의의 카드값을 갖는다. H6
        cardVal = CardUtil.SUIT[deck]+CardUtil.VALU[suit];
    }
    //테스트용
    public Card105(String s){
        this.cardVal =s; //문자열은 값 복사
    }
    //복사 생성자
    public Card105(Card105 c){
        this(c.getCardVal()); //문자열은 값 복사
        //This.cardVal = c.getCardVal(); //동일
    }
    @Override
    public String toString(){
        return "[" + cardVal + "]";
    }
    //hashCode() and equals() 를 이용하여 자동으로 만들자
    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result +((cardVal == null)?0:cardVal.hashCode());
        return result;
    }
    //소스를 정리하면 카드값과 카드값을 일대일로 비교한다.
    @Override
    public boolean equals(Object obj){
        Card105 cb = (Card105) obj;
        if(cardVal.equals(cb.getCardVal())){
            return true;
        } else {
            return false;
        }
    }
    public static int compareCard(Card105 c1,Card105 c2){
        return c1.getCardVal().compareTo(c2.getCardVal());
    }
    public static int comapreRCard(Card105 c1,Card105 c2){
        return -c1.getCardVal().compareTo(c2.getCardVal());
    }
}
