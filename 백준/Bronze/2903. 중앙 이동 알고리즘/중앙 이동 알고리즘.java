import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 2;
        for (int i = 0; i < n; i++) {
            result = result * 2 - 1;
        }

        result = result * result;
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}