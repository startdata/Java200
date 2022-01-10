package Java200;
//Math 클래스 메서드
//소수 판별 로직
public class PrimMath {
    public static boolean isPrime(int n){
        boolean isS = true;
        for(int i =2; i <=(int)Math.sqrt(n);i++){
            if(n%i==0){
                isS=false;
                break;
            }
        }
        return isS;
    }

    public static void main(String[] args) {
        int number= 7;
        boolean ifPrime=isPrime(number); //소수인가 를 확인한다.
        if(ifPrime){
            System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.",number);
        }
        else{
            System.out.printf("%d은 소수가 아니다.",number);
        }
    }
}
