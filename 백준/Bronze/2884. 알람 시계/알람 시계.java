import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();
            int rH;
            int rM;

            if (m < 45) {
                if (h == 0) {
                    h = 24;
                }
                rH = h - 1;
                rM = 60 - (45 - m);
            } else {
                rH = h;
                rM = m - 45;
            }

        System.out.println(rH + " " + rM);
    }
}