import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            int rH;
            int rM;

            int sha = t / 60;
            int rem = t % 60;

            rH = h + sha;
            rM = m + rem;

            if (rM >= 60) {
                rH += rM / 60;
                rM %= 60;
            }
            
        if (rH >= 24) {
            rH %= 24;
        }

        System.out.println(rH + " " + rM);
    }
}