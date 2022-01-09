package Java200;
//삼항(?:)연산자
// 삼항 연산자를 if문 처럼 사용할수 있다.
public class EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 99;
        temp = (temp%2==1) ? temp*3+1 : temp/2;
        System.out.printf("계산 후 = %d\n", temp);
    }
}
