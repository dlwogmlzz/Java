 package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; // 1. 배열 변수 선언, 선언만 하면 참조 값만 들어 간다.(x001)
        students = new int[5]; // 2. 배열 생성, 참조형  배열은 동적으로 사이즈를 변경할 수 있다.

        System.out.println(students); // 배열 생성후 메모리의 참조값을 students에 넣는다. [I@a09ee92 I는 Int를 의미 @뒤는 16진수 참조값

        // 변수 값 사용, 배열 리펙토링, 변수를 사용해야 반복문을 쓸수있다.
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생 " + (i + 1) +"의 점수 : " + students[i] + "점 입니다.");
        }

        System.out.println("현재 students 배열의 개수는 " + students.length + "개 입니다.");
    }
}
