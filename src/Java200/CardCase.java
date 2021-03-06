package Java200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardCase {
    //aggregation: CardCase 는 Card로 구성된다.
    private List<Card105> cards =new ArrayList<Card105>();
    public CardCase(){
        cards.clear();  // 내용 지우기
    }
    // List 반환
    public List<Card105> getCards(){
        return cards;
    }
    //List에 저장된 Card의 개수
    public int count(){
        return cards.size(); //저장된 Card 개수
    }
    //List의 index번째 Card
    public Card105 getCard(int index){
        return cards.get(index); //index번째 Card
    }
    //서로 다른 카드 20장 만들기
    public void make(){
        cards.clear();  // 내용 지우기
        int suit = CardUtil.SUIT.length; // 2
        int valu = CardUtil.VALU.length; // 10
        int count = 0;
        // 서로 다른 20개의 카드를 만든다.
        while (count!=valu+suit){       //20장이 될 떄까지
            Card105 c = new Card105();  //임의의 카드를 만든다.
            if(!cards.contains(c)){     //contains -> equals()를 이용해 비교
                cards.add(c);           //같은 객체가 아니라면 저장
                count++;
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards); //카드섞기
    }
    public void print(){
        int valu = CardUtil.VALU.length;
        for(int i = 0; i< cards.size(); i++){
            Card105 c = cards.get(i);
            System.out.printf("%s",c.toString());
            if((i+1)%valu==0){
                System.out.println();
            }
        }
    }
    public void sort(){
        Comparator<Card105> cmp = new Comparator<Card105>() {
            @Override
            public int compare(Card105 c1, Card105 c2) {
                return c1.getCardVal().compareTo(c2.getCardVal());
            }
        };
        cards.sort(cmp);
        //Collections.sort(cards,new CardComp());
    }
    public void rsort(){
        cards.sort(new Comparator<Card105>() {
            @Override
            public int compare(Card105 c1, Card105 c2) {
                return -c1.getCardVal().compareTo(c2.getCardVal());
            }
        });
        //Collections.sort(cards,new CardComp());
    }
    public void lambdasort(){
        cards.sort((c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());});
    }
    public void lambdasort2(){
        cards.sort(Comparator.comparing(Card105::getCardVal)); // comparing
    }
    public void lambdasort3(){
        cards.sort(Card105::compareCard); //static
    }
    public void lambdarsort(){
        cards.sort(
                (c1,c2) -> {return -c1.getCardVal().compareTo(c2.getCardVal());}
        );
    }
    public void lambdarsort2(){
        Comparator<Card105> mycard = (c1,c2) -> {return c1.getCardVal().compareTo(c2.getCardVal());};
        cards.sort(mycard.reversed());
    }
    public void lambdarsort3(){
        cards.sort(Card105::comapreRCard); // static
    }
}
