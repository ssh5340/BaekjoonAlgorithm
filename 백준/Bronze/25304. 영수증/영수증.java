import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        int kind = sc.nextInt();
        long sum = 0;

        String result;

        for (int i = 0; i < kind; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();

            sum += price * cnt;
        }

        result = total == sum ? "Yes" : "No";

        System.out.println(result);
    }
}