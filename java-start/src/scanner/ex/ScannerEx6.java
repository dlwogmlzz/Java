package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = input.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            // 마지막 값이 num2가 아닐때만 ,를 넣어준다
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
