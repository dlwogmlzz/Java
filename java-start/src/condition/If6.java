package condition;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        /**
         * if문을 각각 사용할지, if와 else if를 함께 묶어서 사용할지는 요구사항에 따라 다르다.
         * 둘의 차이를 이해하고 적절하게 사용하면 된다.
         *
         * ex1) if (true)
         *      System.out.println("if문에서 실행됨");
         *      System.out.println("if문에서 실행 안됨");
         *
         * ex1 실행결과
         * if문에서 실행됨
         *
         *
         * ex2) if (true) {
         *      System.out.println("if문에서 실행됨");
         *      System.out.println("if문에서 실행 안됨");
         * }
         *
         * ex2 실행결과
         * if문에서 실행됨
         * if문에서 실행안됨
         *
         * 프로그래밍 스타일에 따라 다르겠지만, 일반적으로는 if문의 명령이 한개만 있을 경우에도 다음과 같은 이유로 중괄호를 사용하는 것이 좋다.
         * 1. 가독성: 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 준다. 조건문의 범위가 명확하게 표시되므로 코드의 흐름을 더 쉽게 이해 할 수 있다.
         * 2. 유지보수성: 중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다.
         *    예를 들어, if문에 또 다른 코드를 추가하려고 할 때, 중괄호가 없으면 이 코드가 if문의 일부라는 것이 명확하지 않을 수 있다.
         * */


        if (price >= 10000) { // 이것만 적용이된다.
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시, 1000원 할인");
        }else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");
    }
}
