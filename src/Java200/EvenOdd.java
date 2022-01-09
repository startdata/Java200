package Java200;
//while
public class EvenOdd {
    public static void showOddnEvenw(int n){
        int temp = n;
        while(temp!=1){
            if(temp%2==1){
                temp = temp*3+1; //홀수
            }
            else{
                temp /= 2; //짝수
            }
            System.out.printf("["+temp+"]");
        }
        System.out.println("\n--------------------------");
    }

    public static void main(String[] args) {
        showOddnEvenw(122);
    }
}
