package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존시작
        // if문 안에 선언한 변수는 if문 안에서만 생존가능
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        // x를 실행하면 java: cannot find symbol에러
        // System.out.println("main x = " + x);
        System.out.println("main x = " + m);
    }// m 생존 종료
}
