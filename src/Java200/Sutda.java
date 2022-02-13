package Java200;

import java.util.Date;
import java.util.Scanner;

public class Sutda {
    CardCase cc = new CardCase(); //카드를 저장
    CardRule rule = new CardRule(); //2장의 카드를 받아서 계산
    Card105[] cc1 = new Card105[CardUtil.SUTDA];
    Card105[] cc2 = new Card105[CardUtil.SUTDA];

    public Sutda(){
        cc.make(); //카드 만들기
    }
    // 너 둘 나 둘
    private void divide(){
        for(int i =0; i <CardUtil.SUTDA;i++){
            cc1[i]=cc.getCard(i); //0,1
            cc2[i]=cc.getCard(i+CardUtil.SUTDA); //2,3
        }
    }
    //너 하나 나 하나
    public void divide2(){
        for(int i = 0,j=0; i<cc1.length;i++,j+=2){
            cc1[i]=cc.getCard(j);   // 0,2
            cc2[i]=cc.getCard(j+1); //1,3
        }
    }
    public void play(){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to cardgame"+new Date()+"!!");
        System.out.println("Start!");
        String ss ="N";
        do{
            cc.shuffle();
            divide2();
            int v1 = rule.rule(cc1[0],cc1[1]); //족보이용한 값
            int v2 = rule.rule(cc2[0],cc2[1]); //족보이용한 값
            if(v1>v2){
                System.out.println("YOU WIN!");
            } else if(v1<v2){
                System.out.println("YOU LOSE");
            } else {
                System.out.println("YOU SAME");
            }
            // 카드 종류와 값을 출력
            cc.print();
            System.out.println("YOU ");
            System.out.println(cc1[0]+""+cc1[1]);
            System.out.println(rule.rule(cc1[0],cc1[1]));
            System.out.println("COM");
            System.out.println(cc2[0]+""+cc2[1]);
            System.out.println(rule.rule(cc2[0],cc2[1]));

            System.out.println("welcome To CardGame");
            System.out.println("Do you want to replay again(Y/N)");
            ss= sc.next();
        } while ((ss.toUpperCase()).equalsIgnoreCase("Y"));
        System.out.println("Good Bye");
    }
}
