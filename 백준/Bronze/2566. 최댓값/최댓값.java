import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[9][9];
        int max = 0;
        int n = 0;
        int m = 0;

        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    n = i + 1;
                    m = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(n + " " + m);
        bw.flush();
        bw.close();
        br.close();
    }
}