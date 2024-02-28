package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 1. 배열 변수 선언, 선언만 하면 참조 값만 들어 간다.(x001)
        students = new int[5]; // 2. 배열 생성, 참조형  배열은 동적으로 사이즈를 변경할 수 있다.

        System.out.println(students); // 배열 생성후 메모리의 참조값을 students에 넣는다. [I@a09ee92 I는 Int를 의미 @뒤는 16진수 참조값

        // 변수 값 대입
        students[0] = 90;
        students[1] = 88;
        students[2] = 52;
        students[3] = 71;
        students[4] = 100;
        // students[5] = 65; // Index 5 out of bounds for length 5 에러 발생

        System.out.println("학생1의 점수 : " + students[0] + "점 입니다.");
        System.out.println("학생2의 점수 : " + students[1] + "점 입니다.");
        System.out.println("학생3의 점수 : " + students[2] + "점 입니다.");
        System.out.println("학생4의 점수 : " + students[3] + "점 입니다.");
        System.out.println("학생5의 점수 : " + students[4] + "점 입니다.");
    }
}
