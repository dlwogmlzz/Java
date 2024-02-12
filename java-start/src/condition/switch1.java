package condition;

public class switch1 {
    public static void main(String[] args) {
        int score = 2;

        int coupon;

        if (score == 1) {
            coupon = 1000;
        } else if (score == 2) {
            coupon = 2000;
        } else if (score == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
