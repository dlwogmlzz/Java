package condition;
/**
 * break가 없다고 가정할 경우 - 비즈니스 요구사항이 변경되었다.
 * 2등급도 3등급도 같이 3000원 쿠폰을 준다고 가정하면...
 * */

/**
 * if문 vs switch문
 * switch문의 조건식을 넣는 부분을 잘 보면 x > 10과 같은 참 거짓의 결과가 나오는 조건이 아니라,
 * 단순히 값만 넣을수 있다.
 * switch문은 조건식이 특정 case와 같은지만 체크 한다. 쉽게 말해 값이 같은지 확인하는 연산만 가능하다.(문자도 가능)
 *
 * 반면에 if문은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있다. 예) x > 10, x == 10
 * 정리하자면, switch문 없이 if문만 사용해도 된다.
 * 하지만 특정 값에 따라 코드를 실행할 때는 switch문을 사용하면 if문 보다 간결한 코드를 작성할 수 있다.
 *
 * */
public class Switch3 {
    public static void main(String[] args) {
        int score = 2;
        int coupon;

        // if문 보다 직관적이다.
        switch (score) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

    }
}
