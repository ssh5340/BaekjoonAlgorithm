import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int[] nomal = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int chk = Integer.parseInt(st.nextToken());
            int result = nomal[i] - chk;
            bw.write(result + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}