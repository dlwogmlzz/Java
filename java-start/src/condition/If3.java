package condition;

public class If3 {
    public static void main(String[] args) {
        int age = 8;

        /**
         * 이 코드의 단점
         * 1. 불필요한 조건 검사 : 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사한다.
         *    예를 들어, 나이가 5살이면 미취학이 이미 출력이 된다. 그런데 나머지 if문을 통한 조건검사도 모두 실행해야 한다.
         * 2. 코드의 효율성 : 예를 들어서 나이가 8살인 초등학생이라면 미취학을 체크하는 조건인 age <= 7을 통해 나이가,
         *    이미 8살이 넘는다는 사실을 알 수 있다. 그런데 바로 다음에 있는 초등학생을 체크하는 조건에서 age >= 8 && age <= 13이라는,
         *    2가지 조건을 모두 수행한다. 여기서 age >= 8 이라는 조건은 이미 앞의 age <= 7 이라는 조건과 관련이 있다.
         *    결과적으로 조건을 중복 체크한 것이 된다.
         *
         * */
        if (age <= 7) {
            System.out.println("미취학");
        }
        // 그냥 age <= 13 일때, age가 5이면 미취학과 초딩 둘다 출력된다.
        if(age >= 8 && 13 >= age) {
            System.out.println("초딩");
        }
        if(age >= 14 && 16 >= age) {
            System.out.println("중딩");
        }
        if(age >= 17 && 19 >= age) {
            System.out.println("고딩");
        }
        if(age >= 20){
            System.out.println("대학성 or 성인");
        }
    }
}
