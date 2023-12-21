import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[2];
        String s1 = br.readLine();

        StringTokenizer st = new StringTokenizer(s1);

        for (int i = 0; i < 2; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        int[] n2 = new int[n[0]];
        String s2 = br.readLine();

        StringTokenizer st2 = new StringTokenizer(s2);

        for (int i = 0; i < n[0]; i++) {
            n2[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n[0]; i++) {
            if (n2[i] < n[1]) {
                String res = n2[i] + " ";
                bw.write(res);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}