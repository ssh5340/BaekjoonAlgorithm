import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String test = "abcdefghijklmnopqrstuvwxyz";
        String input = br.readLine();
        int[] result = new int[26];

        for (int i = 0; i < 26; i++) {
            char chr = test.charAt(i);
            int num = input.indexOf(chr);
            result[i] = num;
        }

        for (int i = 0; i < 26; i++) {
            bw.write((result[i]) + " ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}