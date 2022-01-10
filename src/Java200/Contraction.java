package Java200;
//축약 연산자
// 각 자리수 더하기
public class Contraction {
    public static int sumEach(int n){
        int tot=0;
        while(n!=0){
            tot+=n%10; //3->2->1
            n/=10; // 123->12->1->0
        }
        return tot;
    }

    public static void main(String[] args) {
        int number = 1234567;
        int value = sumEach(number);
        System.out.printf("%d에대한 각 자리의 숫자 합:%d",number,value);
    }
}
