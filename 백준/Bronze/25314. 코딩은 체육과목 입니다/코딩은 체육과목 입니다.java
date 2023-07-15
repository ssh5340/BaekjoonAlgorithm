import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int roopCnt = n / 4;
        String result = "";

        for (int i = 0; i < roopCnt; i++) {
            result += "long" + " ";
        }

        System.out.println(result + "int");
    }
}