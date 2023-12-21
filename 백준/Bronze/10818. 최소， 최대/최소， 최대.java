import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s1 = Integer.parseInt(br.readLine());
        String arr = br.readLine();
        int[] n = new int[s1];

        StringTokenizer st = new StringTokenizer(arr);

        for (int i = 0; i < s1; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(n);

        String min = String.valueOf(n[0]);
        String max = String.valueOf(n[n.length-1]);

        bw.write(min + " ");
        bw.write(max);

        br.close();
        bw.flush();
        bw.close();
    }
}