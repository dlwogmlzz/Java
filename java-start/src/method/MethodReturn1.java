package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(3);
        System.out.println("결과: " + result);
    }

    // 반환 타입이 있으면 무조건 반환을 해야 한다.
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
