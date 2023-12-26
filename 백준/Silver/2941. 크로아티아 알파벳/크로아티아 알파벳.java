import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toLowerCase();
        String[] chk = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < chk.length; i++) {
            input = input.replaceAll(chk[i], ".");
        }

        bw.write(String.valueOf(input.length()));

        bw.flush();
        br.close();
        bw.close();
    }
}