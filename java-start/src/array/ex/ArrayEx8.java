package array.ex;

import java.util.Scanner;

// 4명의 학생의 국영수 점수의 총점와 평균구하기
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentCount = sc.nextInt();

        int[][] scores = new int[studentCount][3];
        String [] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번의 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + "과목의 점수는: ");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double avg = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점은 " + total + ", 평균은 " + avg);
        }
     }
}
