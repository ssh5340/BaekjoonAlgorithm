import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        int num = Integer.parseInt(br.readLine());

        char result = text.charAt(num - 1);

        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
}