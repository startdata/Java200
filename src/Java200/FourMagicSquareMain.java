package Java200;

import java.util.Scanner;

public class FourMagicSquareMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("4의 배수 정수를 입력하세요");
        FourMagicSquare fms = new FourMagicSquare(n);
        fms.make();
    }
}
