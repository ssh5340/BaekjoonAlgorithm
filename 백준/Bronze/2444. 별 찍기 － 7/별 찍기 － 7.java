import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int n = -1;

        for (int i = 1; i < cnt + 1; i++) {
            n += 2;
            for (int j = cnt-i; j > 0 ; j--) {
                bw.write(" ");
            }
            for (int j = 0; j < n; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = 1; i < cnt + 1; i++) {
            n -= 2;
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < n; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}