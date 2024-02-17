package scanner;

// Java 라이브러리의 Scanner
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello\n");
        System.out.print("world\n");

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        // 정수외 문자를 입력하면 에러가 발생
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);

    }
}
