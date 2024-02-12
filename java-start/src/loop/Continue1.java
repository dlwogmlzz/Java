package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i=1,2,3,4,5
        while (i <= 5) {
            if (i == 3) {
                i++;
                // 3일때, continue로 밑에 구문은 무시하고 바로 다음 while로 넘어간다.
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
