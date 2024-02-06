import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        List<Integer> resList = new ArrayList<>();

        for (int i = a; i < b + 1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }
            if (list.size() == 2) {
                resList.add(i);
            }
        }

        if (resList.size() == 0) {
            bw.write("-1");
        } else {
            for (int i = 0; i < resList.size(); i++) {
                sum += resList.get(i);
            }
            bw.write(sum + "\n");
            bw.write(String.valueOf(resList.get(0)));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
