import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int result = 0;
            int chg = Integer.parseInt(br.readLine());

            result = chg / 25;
            chg %= 25;

            bw.write(result + " ");

            result = chg / 10;
            chg %= 10;

            bw.write(result + " ");

            result = chg / 5;
            chg %= 5;

            bw.write(result + " ");

            result = chg / 1;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}