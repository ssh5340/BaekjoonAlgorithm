import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;
        String input = br.readLine();

        for (int i = 0; i < cnt; i++) {
            char num = input.charAt(i);
            sum += Integer.parseInt(String.valueOf(num));
        }

        bw.write(String.valueOf(sum));
        bw.flush();

        br.close();
        bw.close();
    }
}