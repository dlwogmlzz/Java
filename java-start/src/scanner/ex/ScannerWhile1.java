package scanner.ex;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료합니다) : ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다 : ");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt();
            // nextLine으로 한번 띄워준다.
            input.nextLine();

            System.out.println("입력한 이름은 : " + name + "님 안녕하세요. 당신의 나이는 : " + age + "살입니다.");
        }
    }
}
