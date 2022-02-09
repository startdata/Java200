package Java200;

import java.util.Comparator;

public class CardRomp implements Comparator<Card105> {
    @Override
    public int compare(Card105 c1, Card105 c2) {
        //문자열 comparaTo() - 사전식 비교
        if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)){
            return -1;
        } else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)){
            return 1;
        } else{
            if(CardUtil.toVal(c1.getCardVal().charAt(1))>
            CardUtil.toVal(c2.getCardVal().charAt(1))){
                return -1;
            } else if(CardUtil.toVal(c1.getCardVal().charAt(1))<
            CardUtil.toVal(c2.getCardVal().charAt(1))){
                return 1;
            } else return 0;
        }
    }
}
