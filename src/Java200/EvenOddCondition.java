package Java200;

// if condition

public class EvenOddCondition {
    public static void main(String[] args) {
        int temp = 100;
        if(temp%2 == 1){ //홀수
            temp= temp*3+1;
        }
        else{
            temp=temp/2;
        }
        System.out.printf("계산후 = %d\n",temp);
    }
}
