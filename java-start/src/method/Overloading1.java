package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1번: " + add(100, 200));
        System.out.println("2번: " + add(300, 400, 300 ));
    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
