package condition;

public class Switch2 {
    public static void main(String[] args) {
        int score = 3;
        int coupon;

        // if문 보다 직관적이다.
        switch (score) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

    }
}
