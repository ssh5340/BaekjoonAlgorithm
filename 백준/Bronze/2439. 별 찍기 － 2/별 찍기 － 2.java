import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        int idx = 1;

        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                if (a >= n - idx) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.newLine();
            idx++;
        }
        bw.flush();
        bf.close();
        bw.close();
    }
}