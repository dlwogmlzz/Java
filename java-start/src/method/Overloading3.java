package method;

// 본인의 타입에 최대한 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아서 실행한다.
public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1번: " + add(10, 20));
        System.out.println("2번: " + add(2.5, 3.5));
    }
//    없어도 double이 int보다 크기때문에 double 메서드에서 실행되고, 자동형변환이 돼서 double로 출력됌
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2 번 호출");
        return a + b;
    }
}
