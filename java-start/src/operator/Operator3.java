package operator;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3)
        int sum2 = (1 + 2) * 3; // 괄호가 곱셉보다 연산순위가 높다.
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
