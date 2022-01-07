package Java200;

public class Grad {
    public static void main(String[] args) {
        int kor = 90;
        int eng = 80;
        int math = 89;

        int tot = kor + eng + math;
        int average = tot/3;
        System.out.printf("국어 %d,영어 %d, 수학 %d =>\t", kor,eng,math); //\t 7칸 넘김
        System.out.printf("총점 %d,평균 %d", tot,average);
    }
}
