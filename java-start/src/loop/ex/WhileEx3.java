package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // 최종수를 100으로 지정
        int max = 100;
        // 최종합계 sum 변수를 0으로 지정
        int sum = 0;
        // 초기값 1로 지정
        int i = 1;
        // 1부터 100동안
        while (i <= max) {
            // sum을 점점 증가 시킴
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
