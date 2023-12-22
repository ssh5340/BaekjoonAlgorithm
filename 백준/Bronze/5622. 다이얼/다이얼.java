import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] time = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        String[] num = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int val = 0;

        String input = br.readLine();
        int[] result = new int[input.length()];

        int idx = 0;
        for (int a = 0; a < input.length(); a++) {
            for (int i = 0; i < num.length; i++) {
                if (num[i].indexOf(input.charAt(a)) > -1) {
                    result[idx] = i + 1;
                    break;
                }
            }
            idx++;
        }

        for (int i : result) {
            val += 2 + time[i];
        }

        bw.write(String.valueOf(val));
        bw.flush();
        br.close();
        bw.close();
    }
}