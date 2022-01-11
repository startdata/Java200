package Java200;

public class StringBufferMain {
    public static void main(String[] args) {
        //StringBuffer 생성
        StringBuffer sb1 = new StringBuffer();
        //1 계속 붙이는 함수 mutable
             sb1.append("안녕하세요.")
                .append("또 만나요.")
                .append("모두를 사랑해요. 기다려봐.");
        System.out.println(sb1.toString()+sb1.hashCode());
        //2 Replace
        sb1.replace(0,2,"나 보기가 역겨워");
        System.out.println(sb1.toString()+sb1.hashCode());
        //3 reverse
        sb1.reverse();
        System.out.println(sb1.toString());
        //4 delete
        sb1.delete(10,15);
        System.out.println(sb1.toString());
        //5 cal by reference, shallow copy
         replaces(sb1);
        System.out.println(sb1.toString());
    }

    private static void replaces(StringBuffer sb1) {
        sb1.reverse();
        sb1.replace(0,3,"GoGo"); //0부터 2까지를 GoGo로
    }
}
