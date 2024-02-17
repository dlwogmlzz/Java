package scanner.ex;

import java.util.Scanner;

public class ScannerWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.print("(1: 상품입력, 2: 결제, 3: 프로그램 종료) : ");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String product = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = sc.nextInt();

                System.out.print("구매수량을 입력하세요 : ");
                int quantity = sc.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명은 : " + product + " 가격은 " + price + "원입니다. 수량은 "
                        + quantity + "개 입니다. 합계는 " + price * quantity);

            } else if (option == 2) {
                System.out.println("총 비용은 : " + totalCost);
                // 총비용 0으로 초기화
                totalCost = 0;
            } else if (option == 3) {
                sc.nextLine();
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("올바른 옵션을 선택해주세요..");
            }
        }
    }
}
