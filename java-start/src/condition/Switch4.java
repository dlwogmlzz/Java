package condition;

public class Switch4 {
    public static void main(String[] args) {
        int score = 2;

        /**
         * 새로운 switch문
         * 기존 switch문과의 차이
         * 1. ->를 사용한다.
         * 2. 선택된 데이터를 반환할 수 있다.
         * */
        int coupon = switch (score) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
