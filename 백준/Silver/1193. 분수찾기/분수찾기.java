import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int num = 0;
        int a = 1;
        int b = 1;
        while (n != num) {
            cnt++;
            if (cnt % 2 != 0) {
                for (int i = 0; i < cnt; i++) {
                    a = cnt - i;
                    b = i + 1;
                    num++;
                    if (num == n) {
                        break;
                    }
                }
            } else {
                for (int i = 0; i < cnt; i++) {
                    a = i + 1;
                    b = cnt - i;
                    num++;
                    if (num == n) {
                        break;
                    }
                }
            }
        }

        bw.write(a + "/" + b);
        bw.flush();
        bw.close();
        br.close();
    }
}