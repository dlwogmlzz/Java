package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // while true이면 무한반복
        while (true) {
            // sum을 1씩 증가, sum=1+2+3+4+5
            sum = sum + i;
            // sum이 10보다 크면 출력해주고 break로 종료
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + "sum=" + sum);
                break;
            }
            // 그게 아니면 i를 1씩 증가
            i++;
        }
    }
}
