package condition;

public class If5 {
    public static void main(String[] args) {
        /**
         * 이 코드에서는 각각 독립된 if문이 있다. 따라서 해당하는 모든 할인을 적용한다.
         * 만약 else if를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고, 나머지는 무시된다.
         * 따라서 사용자는 나머지 할인을 놓칠 수 있다.
         * */

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + "원");
    }
}
