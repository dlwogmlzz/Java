package condition;

public class If2 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) { // true, 참일 떄 실행
            System.out.println("성인입니다.");
        } else { // false, 만족하는 조건이 없을 때 실행
            System.out.println("미성년자입니다.");
        }
    }
}
