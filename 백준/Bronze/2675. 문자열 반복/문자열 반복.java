import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String[] arr = {st.nextToken(), st.nextToken()};
            for (int a = 0; a < arr[1].length(); a++) {
                for (int e = 0; e < Integer.parseInt(arr[0]); e++) {
                    bw.write(String.valueOf(arr[1].charAt(a)));
                }
            }
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}