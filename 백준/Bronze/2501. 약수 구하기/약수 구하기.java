import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        List<Integer> arr = new ArrayList<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                arr.add(i);
            }
        }
        if (arr.size() < b) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(arr.get(b - 1)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
