import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringBuilder result = new StringBuilder();

            String text = br.readLine();
            result.append(text.charAt(0));
            result.append(text.charAt(text.length() - 1));
            result.append("\n");
            bw.write(result.toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}