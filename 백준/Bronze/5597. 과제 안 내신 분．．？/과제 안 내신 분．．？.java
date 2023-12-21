import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] std = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            std[num-1] = num;
        }

        for (int i = 0; i < 30; i++) {
            if (std[i] != i + 1) {
                bw.write(String.valueOf(i+1 + " "));
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}