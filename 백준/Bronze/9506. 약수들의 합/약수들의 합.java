import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            List<Integer> arr = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if (n == -1) {
                break;
            }

            for (int i = 1; i < n + 1; i++) {
                if (n % i == 0 && n != i) {
                    arr.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                String msg = n + " = 1";
                for (int i = 1; i < arr.size(); i++) {
                    msg = msg + " + " + arr.get(i);
                }
                bw.write(msg + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
