package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;
        String mark = "*";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(mark);
            }
            System.out.println();
        }
    }
}
