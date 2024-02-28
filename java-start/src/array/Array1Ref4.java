 package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        // int[] students; // 1. 배열 변수 선언, 선언만 하면 참조 값만 들어 간다.(x001)
        // students = new int[5]; // 2. 배열 생성, 참조형  배열은 동적으로 사이즈를 변경할 수 있다.
        // 배열 생성과 초기화를 한번에,  new int[]도 생략가능함.
        // int[] students = new int[] {90, 88, 52, 71, 100};

        int[] students = {90, 88, 52, 71, 100};

        System.out.println(students); // 배열 생성후 메모리의 참조값을 students에 넣는다. [I@a09ee92 I는 Int를 의미 @뒤는 16진수 참조값

        // 배열변수 값 대입
        // students[0] = 90;
        // students[1] = 88;
        // students[2] = 52;
        // students[3] = 71;
        // students[4] = 100;

        // 일반변수 값 대입
        int students6 = 6;
        int students7 = 7;
        int students8 = 8;
        int students9 = 9;
        int students10 = 10;

        // students[5] = 65; // Index 5 out of bounds for length 5 에러 발생

        // 변수 값 사용, 배열 리펙토링, 변수를 사용해야 반복문을 쓸수있다.
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) +"의 점수 : " + students[i] + "점 입니다.");
        }

        System.out.println("현재 students 배열의 개수는 " + students.length + "개 입니다.");

        System.out.println("\n-----------------반복문사용하지않음-----------------");
        System.out.println("학생6의 점수 : " + students6 + "점 입니다.");
        System.out.println("학생7의 점수 : " + students7 + "점 입니다.");
        System.out.println("학생8의 점수 : " + students8 + "점 입니다.");
        System.out.println("학생9의 점수 : " + students9 + "점 입니다.");
        System.out.println("학생10의 점수 : " + students10 + "점 입니다.");
    }
}
