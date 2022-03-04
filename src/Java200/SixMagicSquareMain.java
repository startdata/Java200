package Java200;

import java.util.Scanner;

public class SixMagicSquareMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("6,10,14 정수(4n+2)를 입력하세요.");
        SixMagicSquare sms = new SixMagicSquare(n);
        sms.make();
    }
}
