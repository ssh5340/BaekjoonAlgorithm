import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] sub = new int[cnt];
        double sum = 0;

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for (int i = 0; i < cnt; i++) {
            sub[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sub);
        double max = sub[cnt - 1];

        for (int i = 0; i < cnt; i++) {
            double score = (sub[i] / max) * 100;
            sum += score;
        }

        bw.write(String.valueOf(sum / cnt));

        bw.flush();
        br.close();
        bw.close();
    }
}