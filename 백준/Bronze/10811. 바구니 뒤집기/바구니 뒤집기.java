import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n);
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] baguni = new int[arr[0]];
        for (int i = 0; i < arr[0]; i++) {
            baguni[i] = i + 1;
        }

        for (int i = 0; i < arr[1]; i++) {
            String input = br.readLine();
            StringTokenizer st2 = new StringTokenizer(input);
            int[] baguniCp = Arrays.copyOf(baguni, baguni.length);
            int[] iarr = new int[2];

            for (int a = 0; a < 2; a++) {
                iarr[a] = Integer.parseInt(st2.nextToken());
            }
            int cnt = 1;
            int cnt2 = iarr[1] - iarr[0] + 1;

            for (int a = iarr[0]; a < iarr[1] + 1; a++) {
                baguni[iarr[1] - cnt] = baguniCp[iarr[1]-cnt2];
                cnt++;
                cnt2--;
            }
        }

        for (int i = 0; i < arr[0]; i++) {
            bw.write(baguni[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}