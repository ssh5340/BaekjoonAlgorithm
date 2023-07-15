import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i < n + 1; i++) {
            for (int r = 0; r < i; r++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bf.close();
        bw.close();
    }
}