package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
        /**
         * java: incompatible types: possible lossy conversion from double to int 에러
         * 호환되지 않는 유형: double에서 int로의 가능한 손실 변환
         */


        // intValue = doubleValue; // 컴파일 오류 발생
        // int형으로 명시적 형변환
        intValue = (int) doubleValue;
        System.out.println(intValue); // 출력하면 소수점은 잘리고 1만 출력된다.
        System.out.println("doubleValue = " + doubleValue);

        int z = (int) 10.5;
        System.out.println(z);
    }
}
