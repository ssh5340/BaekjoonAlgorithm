import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line1 = br.readLine();
        int[] arr = new int[2];

        StringTokenizer st = new StringTokenizer(line1);

        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] baguni = new int[arr[0]];

        for (int i = 0; i < arr[1]; i++) {
            String insert = br.readLine();
            int[] insertArr = new int[3];
            StringTokenizer st2 = new StringTokenizer(insert);
            for (int a = 0; a < 3; a++) {
                insertArr[a] = Integer.parseInt(st2.nextToken());
            }
            for (int a = insertArr[0]; a < insertArr[1]+1; a++) {
                baguni[a-1] = insertArr[2];
            }
        }

        for (int i = 0; i < arr[0]; i++) {
            bw.write(String.valueOf(baguni[i]) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}