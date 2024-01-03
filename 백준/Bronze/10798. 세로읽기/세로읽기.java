import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = new String[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i].length() < max) {
                int c = max - arr[i].length();
                for (int j = 0; j < c; j++) {
                    arr[i] += " ";
                }
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                bw.write(String.valueOf(arr[j].charAt(i)).replace(" ", ""));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}