package Java200;

public class Grad1 {
    public static void main(String[] args) {
        int[] grade = {90,80,89};
        int tot = grade[0]+grade[1]+grade[2];
        int average = tot/3;
        System.out.printf("국어 %d,영어 %d, 수학 %d => \t",
                grade[0],grade[1],grade[2]);
        System.out.printf("총점 %d,평균 %d",tot,average);
    }
}
