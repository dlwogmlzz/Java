package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        System.out.println("평균값: " + avg(10, 20, 30));
        System.out.println("평균값: " + avg(100, 200, 300));
    }

    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
