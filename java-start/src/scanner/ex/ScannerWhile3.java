package scanner.ex;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("숫자를 입력하세요. (입력을 중단하려면 -1을 입력하세요) : ");
//        while (true) {
//            input = sc.nextInt();
//            if (input == -1) {
//                System.out.println("입력을 중단합니다.");
//                break;
//            }
//            sum += input;
//            // 평균을 구하기 위한 수량
//            count++;
//        }

        while ((input = sc.nextInt()) != -1) {
            sum += input;
            count++;
        }
        // 평균
        double average = (double)sum / count;
        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}