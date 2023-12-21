import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 0;
        int[] org = new int[9];

        for (int i = 0; i < 9; i++) {
            org[i] = Integer.parseInt(br.readLine());
        }

        int[] copy = Arrays.copyOf(org, 9);
        Arrays.sort(org);

        for (int i = 0; i < 9; i++) {
            if (copy[i] == org[8]) {
                num = i + 1;
                break;
            }
        }

        String max = String.valueOf(org[8]);

        bw.write(max + "\n");
        bw.write(String.valueOf(num));

        br.close();
        bw.flush();
        bw.close();
    }
}